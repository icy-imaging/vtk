// java wrapper for vtkMFIXReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMFIXReader extends vtkUnstructuredGridAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfCells_6();
  public int GetNumberOfCells()
  {
    return GetNumberOfCells_6();
  }

  private native int GetNumberOfPoints_7();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_7();
  }

  private native int GetNumberOfCellFields_8();
  public int GetNumberOfCellFields()
  {
    return GetNumberOfCellFields_8();
  }

  private native void SetTimeStep_9(int id0);
  public void SetTimeStep(int id0)
  {
    SetTimeStep_9(id0);
  }

  private native int GetTimeStep_10();
  public int GetTimeStep()
  {
    return GetTimeStep_10();
  }

  private native int GetNumberOfTimeSteps_11();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_11();
  }

  private native int[] GetTimeStepRange_12();
  public int[] GetTimeStepRange()
  {
    return GetTimeStepRange_12();
  }

  private native void SetTimeStepRange_13(int id0,int id1);
  public void SetTimeStepRange(int id0,int id1)
  {
    SetTimeStepRange_13(id0,id1);
  }

  private native void SetTimeStepRange_14(int id0[]);
  public void SetTimeStepRange(int id0[])
  {
    SetTimeStepRange_14(id0);
  }

  private native int GetNumberOfCellArrays_15();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_15();
  }

  private native byte[] GetCellArrayName_16(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_16(id0), StandardCharsets.UTF_8);
  }

  private native int GetCellArrayStatus_17(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_17(bytes0, bytes0.length);
  }

  private native void SetCellArrayStatus_18(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_18(bytes0, bytes0.length,id1);
  }

  private native void DisableAllCellArrays_19();
  public void DisableAllCellArrays()
  {
    DisableAllCellArrays_19();
  }

  private native void EnableAllCellArrays_20();
  public void EnableAllCellArrays()
  {
    EnableAllCellArrays_20();
  }

  public vtkMFIXReader() { super(); }

  public vtkMFIXReader(long id) { super(id); }
  public native long   VTKInit();

}
