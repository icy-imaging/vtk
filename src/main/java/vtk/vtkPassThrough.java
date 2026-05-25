// java wrapper for vtkPassThrough object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPassThrough extends vtkPassInputTypeAlgorithm
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

  private native int FillInputPortInformation_4(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_4(id0,id1);
  }

  private native void SetDeepCopyInput_5(int id0);
  public void SetDeepCopyInput(int id0)
  {
    SetDeepCopyInput_5(id0);
  }

  private native int GetDeepCopyInput_6();
  public int GetDeepCopyInput()
  {
    return GetDeepCopyInput_6();
  }

  private native void DeepCopyInputOn_7();
  public void DeepCopyInputOn()
  {
    DeepCopyInputOn_7();
  }

  private native void DeepCopyInputOff_8();
  public void DeepCopyInputOff()
  {
    DeepCopyInputOff_8();
  }

  private native void SetAllowNullInput_9(boolean id0);
  public void SetAllowNullInput(boolean id0)
  {
    SetAllowNullInput_9(id0);
  }

  private native boolean GetAllowNullInput_10();
  public boolean GetAllowNullInput()
  {
    return GetAllowNullInput_10();
  }

  private native void AllowNullInputOn_11();
  public void AllowNullInputOn()
  {
    AllowNullInputOn_11();
  }

  private native void AllowNullInputOff_12();
  public void AllowNullInputOff()
  {
    AllowNullInputOff_12();
  }

  public vtkPassThrough() { super(); }

  public vtkPassThrough(long id) { super(id); }
  public native long   VTKInit();

}
