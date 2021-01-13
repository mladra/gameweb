const API_ENDPOINT = "http://localhost:8081/api";
const GAMES = "/games";

const getAllGames = () => {
    return fetch(`${API_ENDPOINT}${GAMES}`);
};

const API = {
    getAllGames,
};

export default API;