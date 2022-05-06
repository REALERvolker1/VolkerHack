package family_fun_pack.modules;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import family_fun_pack.render.NoRenderPig;

/* Lower player height, be able to see when travelling 1 by 1 tunnels on pig */

@SideOnly(Side.CLIENT)
public class TallPersonModule extends Module {

  public TallPersonModule() {
    super("Tall POV", "Makes you tall");
  }

  protected void enable() {
    Minecraft mc = Minecraft.getMinecraft();
    mc.player.eyeHeight = 3.6f;
  }

  protected void disable() {
    Minecraft mc = Minecraft.getMinecraft();
    mc.player.eyeHeight = mc.player.getDefaultEyeHeight();
  }

  public void save(Configuration configuration) {}

  public void load(Configuration configuration) {}
}
