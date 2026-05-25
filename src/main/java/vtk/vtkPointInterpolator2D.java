// java wrapper for vtkPointInterpolator2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointInterpolator2D extends vtkPointInterpolator
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

  private native void SetInterpolateZ_4(boolean id0);
  public void SetInterpolateZ(boolean id0)
  {
    SetInterpolateZ_4(id0);
  }

  private native boolean GetInterpolateZ_5();
  public boolean GetInterpolateZ()
  {
    return GetInterpolateZ_5();
  }

  private native void InterpolateZOn_6();
  public void InterpolateZOn()
  {
    InterpolateZOn_6();
  }

  private native void InterpolateZOff_7();
  public void InterpolateZOff()
  {
    InterpolateZOff_7();
  }

  private native void SetZArrayName_8(byte[] id0, int len0);
  public void SetZArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetZArrayName_9();
  public String GetZArrayName()
  {
    return new String(GetZArrayName_9(), StandardCharsets.UTF_8);
  }

  public vtkPointInterpolator2D() { super(); }

  public vtkPointInterpolator2D(long id) { super(id); }
  public native long   VTKInit();

}
