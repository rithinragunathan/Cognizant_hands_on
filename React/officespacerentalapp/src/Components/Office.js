import React from "react";
import officeImg from "../images/office.jpg";

function Office() {
    const offices = [
        {
            id: 1,
            name: "Skyline Tech Park",
            rent: 55000,
            address: "Tidel Park, Chennai"
        },
        {
            id: 2,
            name: "ABC Business Center",
            rent: 72000,
            address: "OMR, Chennai"
        },
        {
            id: 3,
            name: "Innovation Hub",
            rent: 48000,
            address: "Guindy, Chennai"
        },
        {
            id: 4,
            name: "Elite Workspace",
            rent: 85000,
            address: "Velachery, Chennai"
        }
    ];

    return (
        <div className="container">

            <h1>Office Space Rental Application</h1>
            <img
                src={officeImg}
                alt="Office Space"
                width="500"
                height="300"
            />
           
            <h2>Available Office Spaces</h2>

            {
                offices.map((item) => {
                    return (
                        <div
                            key={item.id}
                            style={{
                                border: "1px solid gray",
                                padding: "15px",
                                marginBottom: "15px",
                                borderRadius: "8px"
                            }}>
                            <h3>{item.name}</h3>

                            <p>
                                <b>Rent:</b>
                                <span
                                    style={{
                                        color: item.rent < 60000
                                            ? "red"
                                            : "green"
                                    }}>
                                    {" "}₹{item.rent}
                                </span>
                            </p>

                            <p>
                                <b>Address:</b> {item.address}
                            </p>
                        </div>
                    );
                })
            }

        </div>
    );
}

export default Office;