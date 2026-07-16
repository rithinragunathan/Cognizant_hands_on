import React from 'react'
import style from '../CohortDetails.module.css'
export default function CohortDetails() {
    const cohorts = [
        {
            id: 1,
            name: "INTADMDF10 - .NET FSD",
            startDate: "22-Feb-2022",
            status: "Scheduled",
            coach: "Aathma",
            trainer: "Jojo Jose"
        },
        {
            id: 2,
            name: "ADM21JF014 - Java FSD",
            startDate: "10-Sep-2021",
            status: "Ongoing",
            coach: "Apoorv",
            trainer: "Elisa Smith"
        },
        {
            id: 3,
            name: "CDBJF21025 - Java FSD",
            startDate: "24-Dec-2021",
            status: "Ongoing",
            coach: "Aathma",
            trainer: "John Doe"
        }
    ];
    return (
        <div className={style.container}>
            <h1>Cohort Details</h1>
        {cohorts.map( (cohort) => (
        <div key={cohort.id} className={style.box}>
            <h3 
            style={{
                color: cohort.status === 'Ongoing' ? 'green' : 'blue'
                }}> 
                {cohort.name}
                </h3>
            <dl>
                <dt> start On </dt>
                <dd>{cohort.startDate}</dd>
                <dt>Current status</dt>
                <dd>{cohort.status}</dd>
                <dt>coach</dt>
                <dd>{cohort.coach}</dd>
                <dt>trainer</dt>
                <dd>{cohort.trainer}</dd>
            </dl>
        </div>))}
        </div>
    )
}

