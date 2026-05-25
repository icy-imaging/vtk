// java wrapper for vtkJoinTables object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkJoinTables extends vtkTableAlgorithm
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

  private native void SetMode_4(int id0);
  public void SetMode(int id0)
  {
    SetMode_4(id0);
  }

  private native int GetModeMinValue_5();
  public int GetModeMinValue()
  {
    return GetModeMinValue_5();
  }

  private native int GetModeMaxValue_6();
  public int GetModeMaxValue()
  {
    return GetModeMaxValue_6();
  }

  private native int GetMode_7();
  public int GetMode()
  {
    return GetMode_7();
  }

  private native void SetReplacementValue_8(double id0);
  public void SetReplacementValue(double id0)
  {
    SetReplacementValue_8(id0);
  }

  private native double GetReplacementValue_9();
  public double GetReplacementValue()
  {
    return GetReplacementValue_9();
  }

  private native void SetLeftKey_10(byte[] id0, int len0);
  public void SetLeftKey(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLeftKey_10(bytes0, bytes0.length);
  }

  private native byte[] GetLeftKey_11();
  public String GetLeftKey()
  {
    return new String(GetLeftKey_11(), StandardCharsets.UTF_8);
  }

  private native void SetRightKey_12(byte[] id0, int len0);
  public void SetRightKey(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRightKey_12(bytes0, bytes0.length);
  }

  private native byte[] GetRightKey_13();
  public String GetRightKey()
  {
    return new String(GetRightKey_13(), StandardCharsets.UTF_8);
  }

  private native void SetSourceConnection_14(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_14(id0);
  }

  private native void SetSourceData_15(vtkTable id0);
  public void SetSourceData(vtkTable id0)
  {
    SetSourceData_15(id0);
  }

  public vtkJoinTables() { super(); }

  public vtkJoinTables(long id) { super(id); }
  public native long   VTKInit();

}
