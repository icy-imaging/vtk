// java wrapper for vtkArrayNorm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArrayNorm extends vtkArrayDataAlgorithm
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

  private native int GetDimension_4();
  public int GetDimension()
  {
    return GetDimension_4();
  }

  private native void SetDimension_5(int id0);
  public void SetDimension(int id0)
  {
    SetDimension_5(id0);
  }

  private native int GetL_6();
  public int GetL()
  {
    return GetL_6();
  }

  private native void SetL_7(int id0);
  public void SetL(int id0)
  {
    SetL_7(id0);
  }

  private native void SetInvert_8(int id0);
  public void SetInvert(int id0)
  {
    SetInvert_8(id0);
  }

  private native int GetInvert_9();
  public int GetInvert()
  {
    return GetInvert_9();
  }

  public vtkArrayNorm() { super(); }

  public vtkArrayNorm(long id) { super(id); }
  public native long   VTKInit();

}
