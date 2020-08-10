package com.doneyTag;

import com.doney.entity.Player;
import j2html.tags.ContainerTag;
import j2html.tags.Tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

import static j2html.TagCreator.*;

public class PlayerCard extends SimpleTagSupport {
    private Player player;

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        Tag img = img().withSrc("playerProfilePictures/" + player.getProfilePicture()).withClass("card-img-top").withAlt("player profile picture");
        ContainerTag cardText = div(
                a(player.getFirstName() + " " + player.getLastName()).withClass("card-text").withHref("playerProfile?id=" + player.getPlayerId())
        ).withClass("card-body");
        out.print(div(
                img,
                cardText
        ).withClass("card").withStyle("width: 18rem;").render());
    }
}
