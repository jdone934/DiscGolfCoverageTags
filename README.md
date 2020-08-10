# DiscGolfCoverageTags

This repo holds a Custom Tag Library for my DiscGolfCoverage website ([repo found here](https://github.com/jdone934/DiscGolfCoverage)). 

Currently, the only custom tag takes a Player object and outputs the HTML for that player. This tag is named "Hello" and
takes the player object in an attribute named "player" (see below for an example).

```html
<jd:Hello player="${player}" />
``` 