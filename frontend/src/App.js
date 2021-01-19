import './App.css';
import Login from "./domain/Login";
import { ReactKeycloakProvider } from "@react-keycloak/web";
import keycloak from "./keycloak.config";

const eventLogger = (event, error) => {
    console.log('onKeycloakEvent', event, error);
}

const tokenLogger = (tokens) => {
    console.log('onKeycloakTokens', tokens);
}

const App = () => {

  return (
    <ReactKeycloakProvider
        authClient={keycloak}
        onEvent={eventLogger}
        onTokens={tokenLogger}
    >
      <Login />
    </ReactKeycloakProvider>
  );
}

export default App;
