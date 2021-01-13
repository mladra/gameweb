import './App.css';
import {Box, Container} from '@material-ui/core';
import GameList from "./domain/GamesList";

const App = () => {

  return (
    <Container>
        <Box display="flex" justifyContent="center" pt={2}>
          <GameList />
        </Box>
    </Container>
  );
}

export default App;
