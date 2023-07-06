import "./App.css";
import UserList from "./components/UserList";
import { Routes, Route, BrowserRouter as Router, Link } from "react-router-dom";

const HomePage = () => <h1>Home Page</h1>;
const AboutPage = () => <h1>About Page</h1>;

function App() {
	return (
		// <Router>
		// 	<div>
		// 		<nav>
		// 			<ul>
		// 				<li>
		// 					<Link to="http://localhost:8080/">Home</Link>
		// 				</li>
		// 				<li>
		// 					<Link to="http://localhost:8080/user">About</Link>
		// 				</li>
		// 			</ul>
		// 		</nav>
		// 		<Routes>
		// 			<Route path="/" element={<HomePage />} />
		// 			<Route path="/about" element={<AboutPage />} />
		// 		</Routes>
		// 	</div>
		// </Router>
		<>
			
			<UserList></UserList>
		</>
	);
}


export default App;
