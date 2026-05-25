// java wrapper for vtkBlankStructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBlankStructuredGrid extends vtkStructuredGridAlgorithm
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

  private native void SetMinBlankingValue_4(double id0);
  public void SetMinBlankingValue(double id0)
  {
    SetMinBlankingValue_4(id0);
  }

  private native double GetMinBlankingValue_5();
  public double GetMinBlankingValue()
  {
    return GetMinBlankingValue_5();
  }

  private native void SetMaxBlankingValue_6(double id0);
  public void SetMaxBlankingValue(double id0)
  {
    SetMaxBlankingValue_6(id0);
  }

  private native double GetMaxBlankingValue_7();
  public double GetMaxBlankingValue()
  {
    return GetMaxBlankingValue_7();
  }

  private native void SetArrayName_8(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_9();
  public String GetArrayName()
  {
    return new String(GetArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetArrayId_10(int id0);
  public void SetArrayId(int id0)
  {
    SetArrayId_10(id0);
  }

  private native int GetArrayId_11();
  public int GetArrayId()
  {
    return GetArrayId_11();
  }

  private native void SetComponent_12(int id0);
  public void SetComponent(int id0)
  {
    SetComponent_12(id0);
  }

  private native int GetComponentMinValue_13();
  public int GetComponentMinValue()
  {
    return GetComponentMinValue_13();
  }

  private native int GetComponentMaxValue_14();
  public int GetComponentMaxValue()
  {
    return GetComponentMaxValue_14();
  }

  private native int GetComponent_15();
  public int GetComponent()
  {
    return GetComponent_15();
  }

  public vtkBlankStructuredGrid() { super(); }

  public vtkBlankStructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
