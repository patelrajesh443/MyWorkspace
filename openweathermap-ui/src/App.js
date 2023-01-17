import './App.css';
import './styles.css'
import {
    BrowserRouter, Route, Link, Routes
} from "react-router-dom";
import {Home, Layout, NoPage} from "./pages";

function App() {
    const home = "/"
    const openweathermapurl = "https://openweathermap.org/api"
    return (<div className="App">
        <BrowserRouter>
            <Routes>
                <Route path={home} element={<Layout home={home} openweathermapurl={openweathermapurl}/>}>
                    <Route index element={<Home/>}/>
                    <Route path="*" element={<NoPage/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    </div>);
}

export default App;
