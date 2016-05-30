# BC-Snatch
A 'sniper' for the <a href="https://www.bigcartel.com/">BigCartel webstore platform</a>.

Used to buy limited edition items.

## How It Works
When an item is added to a basket, BigCartel takes the item out of the pool of available stock and creates a session. The basket session will last ten minutes; if the item isn't checked out in this time, the item is put back in the pool of available stock.

BC-Snatch will output session cookies with items in the basket. By using a browser add on (such as <a href="http://www.editthiscookie.com/">EditThisCookie</a>) you can access these sessions and buy the items.

Each instance of BCSnatch will try to create ten sessions.

## Install
<a href="https://github.com/JamesFrost/BC-Snatch/releases/download/v1.0.1/BCSnatch.jar">Download the .jar here</a>.

## Usage
```java -jar BCSnatch.jar [-v] item-url [size]```

`-v` - 
    Verbose Mode (optional)

`item-url` - 
  URL of BigCartel item to snatch

`size` - 
    E.g. SMALL, MEDIUM, LARGE (optional) (case sensitive - has to be an exact match)

## Example Ouput
```
_big_cartel_session=BAh7BzoNb3JkZXJfaWQiEDEyOTk2NzQzNDAxOg9zZXNzaW9uX2lkIiU4ODBhNWZlODY3YmZiNjY3MjA0MTIzN2RjZWQwMzk3MQ%3D%3D--f6071b9d5d286773b4f33894fa04719a3b7c0743; path=/; HttpOnly
 
Out of stock.
 
_big_cartel_session=BAh7BzoNb3JkZXJfaWQiEDEyOTk2NzQzMzgzOg9zZXNzaW9uX2lkIiU1N2M5ZWE0ZDFmNWViMGVjYWE1MTg5ZTg3MDljZDQ5Zg%3D%3D--d30d2e2f970115a256a2fe5eacb59856f6f08a50; path=/; HttpOnly
 
Out of stock.
 
Out of stock.

_big_cartel_session=BAh7BzoPc2Vzc2lvbl9pZCIlZGJhY2RhYjUxMjBhYjU5MmFjN2RmYWVhODk0MWIxYTQ6DW9yZGVyX2lkIhAxMjk5Njc0MzM4OQ%3D%3D--f6850153aa2f1d458c90cd6027953961cf0b3202; path=/; HttpOnly
 
_big_cartel_session=BAh7BzoPc2Vzc2lvbl9pZCIlYmYwOTkxOTYyY2MxY2JjNzMzZGY4MTJhYzJhY2QzYTc6DW9yZGVyX2lkIhAxMjk5Njc0MzM3Nw%3D%3D--1bc700d1ee3610317281889b651245d373f9ed2a; path=/; HttpOnly
 
_big_cartel_session=BAh7BzoNb3JkZXJfaWQiEDEyOTk2NzQzMzg2Og9zZXNzaW9uX2lkIiUzMjU2MGU4YzFkZjk5OWViNjdkOWI3MzM3ZDE5ZjYyZg%3D%3D--55daf987735e92eb5ba1c6fbfce5d3d7068e18d9; path=/; HttpOnly
 
_big_cartel_session=BAh7BzoNb3JkZXJfaWQiEDEyOTk2NzQzMzgwOg9zZXNzaW9uX2lkIiU4NTYwMWJjM2M5NWE4OThiMTQ1N2M4OWE0MTk1ZmYwMA%3D%3D--fe5f92b31656a1844d1a988b280efc8b9a9395ca; path=/; HttpOnly
 
_big_cartel_session=BAh7BzoPc2Vzc2lvbl9pZCIlY2JiZjIyODk2YTliNTA5MmJjOGFkYTBiZDc2MTRkY2M6DW9yZGVyX2lkIhAxMjk5Njc0MzQwNw%3D%3D--9a6e7e80a5195c1a28f68a84b0a14dfddba4b444; path=/; HttpOnly
```

## Disclaimer
I am not responsible for anything you hooligans might do with this. Use at your own risk. Provided for educational purposes only.

## License
MIT
