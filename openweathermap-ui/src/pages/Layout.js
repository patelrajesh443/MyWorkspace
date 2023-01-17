import {Outlet, Link} from "react-router-dom";

export const Layout = ({home, openweathermapurl}) => {
    return (<>
        <div className="navbar">
            <a className="active" href={home}>Home</a>
            <a href={openweathermapurl} target={"_blank"}>OpenWeatherMapsDocs</a>
        </div>
        <Outlet/>
    </>)
};