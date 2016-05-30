# BC-Snatch
A 'sniper' for the <a href="https://www.bigcartel.com/">BigCartel webstore platform</a>.

Used to buy limited edition items.

## How It Works
When an item is added to a basket, BigCartel takes the item out of the pool of available stock and creates a session. The basket session will last ten minutes; if the item isn't checked out in this time, the item is put back in the pool of available stock.

BC-Snatch will output session cookies with items in the basket. By using a browser add on (such as <a href="http://www.editthiscookie.com/">EditThisCookie</a>) you can access these sessions and buy the items.

Each instance of BCSnatch will try to create ten sessions.

## Install
<a href="https://github.com/JamesFrost/BC-Snatch/releases/download/v1.0.1/BCSnatch.jar">Download the .jar here</a>

## Usage
```java -jar BCSnatch.jar [-v] item-url [size]```

`-v` - 
    Verbose Mode (optional)

`item-url` - 
  URL of BigCartel item to snatch

`size` - 
    E.g. SMALL, MEDIUM, LARGE (optional) (case sensitive - has to be an exact match)

## Disclaimer
I am not responsible for anything you hooligans might do with this. Use at your own risk. Provided for educational purposes only.

## License
MIT
