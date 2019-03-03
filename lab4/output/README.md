# Ding Tai Feng Project (Lab 4)

Following entries are in the format of

```markdown
## Class

Responsibilities:

Collaborators:

```

With explanation of design pattern choice at the end.

## Customer

Responsibilities: To create a WaitEntry containing the customer information (name, cell phone number, and number of people in party). They can also request to cancel the WaitEntry, for whatever reason (cancel using the Leave method).

Collaborators: WaitEntry

## WaitEntry

Responsibilities: To add themselves into the waitlist and wait to be consumed once a table is found. If they receive a request to be canceled, request they be taken off the waitlist and removed.

Collaborators: WaitList

## WaitList

Responsibilities: To hold wait entries in queue order (FIFO), and requests/polls the TablesHandler to see if there are any tables available. If there is, it will be reserved. Also deletes entries once they are consumed and fulfilled, or if customer decides to leave.

Collaborators: WaitEntry, TablesHandler

## TablesHandler

Responsibilities: Handler interface for handling requests from WaitList for a new table. Forwards requests on to TableFor2 to see if there is an available table. Also can add new tables via the Table interface to each of the available table types.

Collaborators: Table, TableFor2

## Table

Responsibilities: Interface for other available tables. Table contains list of available tables for each table type, returns any of their positions. Also allows for the addition and removal of tables of particular types at particular positions.

Collaborators: None

## TableFor2

Responsibilities: Handles the request to reserve a table by a customer's entry. Can only take waitlist entries where the number of customers is 2 or less, and only if there is an available table. Otherwise, forwards the request to TableFor4. Keeps track of availability of tables for 2, and can also add or remove tables thru table interface.

Collaborators: TablesHandler, Table, TableFor4

## TableFor4

Responsibilities: Handles the request to reserve a table by a customer's entry. Can only take waitlist entries where the number of customers is 4 or less, and only if there is an available table. Otherwise, forwards the request to TableFor6. Keeps track of availability of tables for 4, and can also add or remove tables thru table interface.

Collaborators: TablesHandler, Table, TableFor6

## TableFor6

Responsibilities: Handles the request to reserve a table by a customer's entry. Can only take waitlist entries where the number of customers is 6 or less. Keeps track of availability of tables for 6, and can also add or remove tables thru table interface.

Collaborators: TablesHandler, Table

## Design Pattern

Pattern: Chain-of-responsibility Pattern

In this particular project we have a type of sender thru the customer that requests a table in a FIFO queue that eventually resolves requests through querying the different table sizes available. The chain-of-responsibility software pattern is suitable because it delegates responsibility and loosely decouples classes. When a customer requests to be put on the waitlist, the waitlist propagates the request to a request handler that passes it onto TableFor(n) classes that may eventually be able to take the request. TableFor2 tables will be taken first if they can be, and if not, then TableFor4 tables, then TableFor6 tables.

### Objects

* Customer, WaitEntry, WaitList (sender)
* TablesHandler (generic handler)
* TableFor2 (concrete handler)
* TableFor4 (concrete handler)
* TableFor6 (concrete handler)