// java wrapper for vtkDepthOfFieldPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDepthOfFieldPass extends vtkDepthImageProcessingPass
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetAutomaticFocalDistance_4(boolean id0);
  public void SetAutomaticFocalDistance(boolean id0)
  {
    SetAutomaticFocalDistance_4(id0);
  }

  private native boolean GetAutomaticFocalDistance_5();
  public boolean GetAutomaticFocalDistance()
  {
    return GetAutomaticFocalDistance_5();
  }

  private native void AutomaticFocalDistanceOn_6();
  public void AutomaticFocalDistanceOn()
  {
    AutomaticFocalDistanceOn_6();
  }

  private native void AutomaticFocalDistanceOff_7();
  public void AutomaticFocalDistanceOff()
  {
    AutomaticFocalDistanceOff_7();
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  public vtkDepthOfFieldPass() { super(); }

  public vtkDepthOfFieldPass(long id) { super(id); }
  public native long   VTKInit();

}
