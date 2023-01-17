import React from "react";

export const WeatherData = ({weatherData, country}) => {
    if (!country) return null;
    return (<>
        <h1>{country}</h1>
        <div className={"Table"}>
            <table>
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Low(In C)</th>
                    <th>High(In C)</th>
                    <th>Message</th>
                </tr>
                </thead>
                <tbody>
                {weatherData.map((weather, index) => (<tr key={index}>
                    <td>{index}</td>
                    <td>{weather.low}</td>
                    <td>{weather.high}</td>
                    <td>{weather.message}</td>
                </tr>))}
                </tbody>
            </table>
        </div>
    </>);
}