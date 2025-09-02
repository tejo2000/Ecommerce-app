import axios from "axios";

const baseURL = "http://localhost:8080/api/";

const axiosClient = axios.create({
  baseURL: baseURL
});

export default axiosClient;
# refactor: move API base URL to env variable instead of hardcoded localhost
