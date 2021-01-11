import './App.css';
import { Box, Container, Paper, Table, TableCell, TableContainer, TableBody, TableHead, TableRow } from '@material-ui/core';
import { useEffect, useState } from 'react';

const App = () => {

  const [data, setData] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8081/api/games", {
      headers: {
        'Access-Control-Allow-Origin': '*'
      } 
    })
    .then(response => response.json())
    .then(retrievedData => setData(retrievedData))
    .catch(err => console.log(err));
  }, []);

  return (
    <Container>
        <Box display="flex" justifyContent="center" pt={2}>
          <TableContainer component={Paper}>
            <Table>
              <TableHead>
                <TableRow>
                  <TableCell>Name</TableCell>
                  <TableCell>Author</TableCell>
                  <TableCell>Release date</TableCell>
                  <TableCell>Rating</TableCell>
                  <TableCell>Average price</TableCell>
                </TableRow>
              </TableHead>
              <TableBody>
                {data && data._embedded && data._embedded.games.map(row => (
                  <TableRow key={row.name}>
                    <TableCell component="th" scope="row">
                      {row.name}
                    </TableCell>
                    <TableCell>{row.author.name}</TableCell>
                    <TableCell>{row.releaseDate}</TableCell>
                    <TableCell>{row.rating}</TableCell>
                    <TableCell>{row.avgPrice}</TableCell>
                  </TableRow>
                ))}
              </TableBody>
            </Table>
          </TableContainer>
        </Box>
    </Container>
  );
}

export default App;
