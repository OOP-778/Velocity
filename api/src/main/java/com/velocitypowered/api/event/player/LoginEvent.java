package com.velocitypowered.api.event.player;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.event.ResultedEvent;
import com.velocitypowered.api.proxy.Player;

/**
 * This event is fired once the player has been authenticated but before they connect to a server on
 * the proxy.
 */
public final class LoginEvent implements ResultedEvent<ResultedEvent.ComponentResult> {

  private final Player player;
  private ComponentResult result;

  public LoginEvent(Player player) {
    this.player = Preconditions.checkNotNull(player, "player");
    this.result = ComponentResult.allowed();
  }

  public Player getPlayer() {
    return player;
  }

  @Override
  public ComponentResult getResult() {
    return result;
  }

  @Override
  public void setResult(ComponentResult result) {
    this.result = Preconditions.checkNotNull(result, "result");
  }

  @Override
  public String toString() {
    return "LoginEvent{"
        + "player=" + player
        + ", result=" + result
        + '}';
  }
}