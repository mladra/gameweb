const API_ENDPOINT = "http://localhost:8081/api";
const GAMES = "/games";

const AUTH_URL = "http://localhost:8083/auth/realms/game-web/protocol/openid-connect/auth?response_type=code&client_id=newClient&scope=read";

const getAllGames = () => {
    return fetch(`${API_ENDPOINT}${GAMES}`);
};

const obtainAccessToken = () => {
  return fetch(`${AUTH_URL}`);
};

const API = {
    getAllGames,
    obtainAccessToken
};

export default API;