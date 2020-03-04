<html>
    <head>
        <style>
            body{
                font-family: Arial, Helvetica, sans-serif;
                font-size: 14px;
            }
        </style>
    </head>
    <body>
        <h1 style="text-decoration: underline;">Fancy Forms</h1>
        <h1>Add flight and airplane</h1>
        <form method="POST" action="AddFlight">

            From: 
            <select id="from_destination" name="from_destination">
                <option value="Colombo">Colombo</option>
                <option value="Los_Angeles">Los Angeles</option>
                <option value="New_York">New York</option>
                <option value="London">London</option>
                <option value="Paris">Paris</option>
                <option value="Rome">Rome</option>
                <option value="Amsterdam">Amsterdam</option>
            </select>
            <br/><br/>

            To: 
            <select id="to_destination" name="to_destination">
                <option value="Colombo">Colombo</option>
                <option value="Los_Angeles">Los Angeles</option>
                <option value="New_York">New York</option>
                <option value="London">London</option>
                <option value="Paris">Paris</option>
                <option value="Rome">Rome</option>
                <option value="Amsterdam">Amsterdam</option>
            </select>

            <h4>Time of flights</h4>

            <hr/>

            Year: 
            <select name="year" id="">
                <option value="2015">2015</option>
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
                <option value="2020">2020</option>
            </select>
            <br/><br/>

            Month: 
            <select name="month" id="">
                <option value="0">January</option>
                <option value="1">February</option>
                <option value="2">March</option>
                <option value="3">April</option>
                <option value="4">May</option>
                <option value="5">June</option>
                <option value="6">July</option>
                <option value="7">August</option>
                <option value="8">September</option>
                <option value="9">October</option>
                <option value="10">November</option>
                <option value="11">December</option>
            </select>
            <br/><br/>

            Day of Month:
            <input name="day" type="text"></input>
            <br/><br/>

            Hour of day(0 - 23):
            <input name="hour" type="text"></input>
            <br/><br/>

            Minute(0 - 59 ):
            <input name="minute" type="text"></input>
            <br/><br/>

            Price:
            <input name="price" type="text"></input>
            <br/><br/>
            <h4>Airplane</h4>
            Plane Make:
            <input name="airplane_make" type="text"></input>
            <br/><br/>

            Model name:
            <input name="airplane_model" type="text"></input>
            <br/><br/>

            Seating:
            <input name="airplane_seating" type="text"></input>
            <br/><br/>

            <hr/>

            <button type="submit">Add Flight and Airplane</button>
            <hr/>

        </form>

        <h1>Add Pilot to Flight</h1>
        <form method="POST" action="CreatePilotAndAddToFlight">

            First name:
            <input name = "first_name" type="text"></input>
            <br/><br/>

            Last name:
            <input name = "last_name" type="text"></input>
            <br/><br/>

            License:
            <input name = "license" type="text"></input>
            <br/><br/>

            Pilot rank:
            <select name="pilot_rank" id="">
                <option value="Captain">Captain</option>
                <option value="First_Officer">First Officer</option>
                <option value="Junior Officer">Junior_Officer</option>
            </select>
            <br/><br/>

            Fligth Id:
            <input name = "fid" type="text"></input>
            <hr/>
            <button type="submit">Add Pilot to Flight</button>

        </form>

        <h1>Add Passenger</h1>
        <form method="POST" action="AddPassenger">

            Fisrt Name:
            <input type="text" name="first_name"></input>
            <br/><br/>

            Last Name:
            <input type="text" name="last_name"></input>
            <br/><br/>

            Date of Birth:
            <input type="text" name="dob"></input>
            <br/><br/>

            Gender:
            <select name="gender">
                <option value="Female">Female</option>
                <option value="Male">Male</option>
            </select>
            <hr/>

            <button type="submit">Add Passenger</button>

        </form>

            <h1>Add Passenger to Flight</h1>
        <form action="" method="POST">

            Add a Passenger with an id of

            <input type="text" name="pid"></input>
            to a Flight with an id of
            <input type="text" name="fid"></input>

            <hr/>

            <button type="submit">Add Passenger to Flight</button>
            <hr/>
        </form>

        <h1>Add flight to passenger <span style="font-size: 16px; vertical-align: middle;">(give a passenger another flight ticket to his/her collections of flight tickets)</span></h1>
        
        <form action="" method="POST">

            Add a ticket for a flight with an id of

            <input type="text" name="fid"></input>
            to a passenger with an id of 
            <input type="text" name="pid"></input>

            <br/><br/>

            <span style="font-weight: bold;">(In real world terms - add a flight ticket to the passenger's collection of tickets)</span>
            <hr/>

            <button type="submit">Add flight (ticket) to passneger's flight tickets</button>

            <hr/>
        </form>

    </body>
</html>