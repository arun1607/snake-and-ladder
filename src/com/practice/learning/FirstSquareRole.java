package com.practice.learning;

import java.util.ArrayList;

public class FirstSquareRole extends RegularSquareRole
{
    private ArrayList<Player> players = new ArrayList<Player>();

    public FirstSquareRole(Square square)
    {
        super(square);
    }

    @Override
    public boolean isFirstSquare()
    {
        return true;
    }

    @Override
    public void enter(Player player)
    {
        players.add(player);
        player.setSquare(square);
    }

    public void leave(Player player)
    {
        players.remove(player);
    }

    @Override
    public boolean isOccupied()
    {
        return !players.isEmpty();
    }
}
