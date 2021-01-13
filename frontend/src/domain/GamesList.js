import {useEffect, useState} from "react";
import GameWebTable from "../components/Table.component";
import API from "../service/ApiService.service";

const GameList = () => {
    const [data, setData]  = useState([])

    useEffect(() => {
        API.getAllGames()
            .then(response => response.json())
            .then(retrievedData => setData(retrievedData._embedded.games))
            .catch(err => console.log(err));
    }, []);

    const columns = [
        {
            label: "Name",
            valueFun: (obj) => obj.name
        },
        {
            label: "Author",
            valueFun: (obj) => obj.author ? obj.author.name : ''
        },
        {
            label: "Release date",
            valueFun: (obj) => obj.releaseDate
        },
        {
            label: "Rating",
            valueFun: (obj) => obj.rating
        },
        {
            label: "Average price",
            valueFun: (obj) => obj.avgPrice
        }
    ]

    return <GameWebTable columns={columns} data={data} />
}

export default GameList;