// java wrapper for vtkVectorNorm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVectorNorm extends vtkDataSetAlgorithm
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

  private native void SetNormalize_4(int id0);
  public void SetNormalize(int id0)
  {
    SetNormalize_4(id0);
  }

  private native int GetNormalize_5();
  public int GetNormalize()
  {
    return GetNormalize_5();
  }

  private native void NormalizeOn_6();
  public void NormalizeOn()
  {
    NormalizeOn_6();
  }

  private native void NormalizeOff_7();
  public void NormalizeOff()
  {
    NormalizeOff_7();
  }

  private native void SetAttributeMode_8(int id0);
  public void SetAttributeMode(int id0)
  {
    SetAttributeMode_8(id0);
  }

  private native int GetAttributeMode_9();
  public int GetAttributeMode()
  {
    return GetAttributeMode_9();
  }

  private native void SetAttributeModeToDefault_10();
  public void SetAttributeModeToDefault()
  {
    SetAttributeModeToDefault_10();
  }

  private native void SetAttributeModeToUsePointData_11();
  public void SetAttributeModeToUsePointData()
  {
    SetAttributeModeToUsePointData_11();
  }

  private native void SetAttributeModeToUseCellData_12();
  public void SetAttributeModeToUseCellData()
  {
    SetAttributeModeToUseCellData_12();
  }

  private native byte[] GetAttributeModeAsString_13();
  public String GetAttributeModeAsString()
  {
    return new String(GetAttributeModeAsString_13(), StandardCharsets.UTF_8);
  }

  public vtkVectorNorm() { super(); }

  public vtkVectorNorm(long id) { super(id); }
  public native long   VTKInit();

}
