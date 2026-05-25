// java wrapper for vtkPeriodicFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPeriodicFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetIterationMode_4(int id0);
  public void SetIterationMode(int id0)
  {
    SetIterationMode_4(id0);
  }

  private native int GetIterationModeMinValue_5();
  public int GetIterationModeMinValue()
  {
    return GetIterationModeMinValue_5();
  }

  private native int GetIterationModeMaxValue_6();
  public int GetIterationModeMaxValue()
  {
    return GetIterationModeMaxValue_6();
  }

  private native int GetIterationMode_7();
  public int GetIterationMode()
  {
    return GetIterationMode_7();
  }

  private native void SetIterationModeToDirectNb_8();
  public void SetIterationModeToDirectNb()
  {
    SetIterationModeToDirectNb_8();
  }

  private native void SetIterationModeToMax_9();
  public void SetIterationModeToMax()
  {
    SetIterationModeToMax_9();
  }

  private native void SetNumberOfPeriods_10(int id0);
  public void SetNumberOfPeriods(int id0)
  {
    SetNumberOfPeriods_10(id0);
  }

  private native int GetNumberOfPeriods_11();
  public int GetNumberOfPeriods()
  {
    return GetNumberOfPeriods_11();
  }

  private native void AddIndex_12(int id0);
  public void AddIndex(int id0)
  {
    AddIndex_12(id0);
  }

  private native void RemoveIndex_13(int id0);
  public void RemoveIndex(int id0)
  {
    RemoveIndex_13(id0);
  }

  private native void RemoveAllIndices_14();
  public void RemoveAllIndices()
  {
    RemoveAllIndices_14();
  }

  public vtkPeriodicFilter() { super(); }

  public vtkPeriodicFilter(long id) { super(id); }

}
