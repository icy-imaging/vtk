// java wrapper for vtkImageMapToWindowLevelColors object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMapToWindowLevelColors extends vtkImageMapToColors
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

  private native void SetWindow_4(double id0);
  public void SetWindow(double id0)
  {
    SetWindow_4(id0);
  }

  private native double GetWindow_5();
  public double GetWindow()
  {
    return GetWindow_5();
  }

  private native void SetLevel_6(double id0);
  public void SetLevel(double id0)
  {
    SetLevel_6(id0);
  }

  private native double GetLevel_7();
  public double GetLevel()
  {
    return GetLevel_7();
  }

  public vtkImageMapToWindowLevelColors() { super(); }

  public vtkImageMapToWindowLevelColors(long id) { super(id); }
  public native long   VTKInit();

}
