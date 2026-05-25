// java wrapper for vtkImageConstantPad object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageConstantPad extends vtkImagePadFilter
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

  private native void SetConstant_4(double id0);
  public void SetConstant(double id0)
  {
    SetConstant_4(id0);
  }

  private native double GetConstant_5();
  public double GetConstant()
  {
    return GetConstant_5();
  }

  public vtkImageConstantPad() { super(); }

  public vtkImageConstantPad(long id) { super(id); }
  public native long   VTKInit();

}
