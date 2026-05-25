// java wrapper for vtkNek5000Reader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNek5000Reader extends vtkUnstructuredGridAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_6();
  public String GetFileName()
  {
    return new String(GetFileName_6(), StandardCharsets.UTF_8);
  }

  private native void SetDataFileName_7(byte[] id0, int len0);
  public void SetDataFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDataFileName_7(bytes0, bytes0.length);
  }

  private native byte[] GetDataFileName_8();
  public String GetDataFileName()
  {
    return new String(GetDataFileName_8(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfTimeSteps_9();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_9();
  }

  private native int[] GetTimeStepRange_10();
  public int[] GetTimeStepRange()
  {
    return GetTimeStepRange_10();
  }

  private native void SetTimeStepRange_11(int id0,int id1);
  public void SetTimeStepRange(int id0,int id1)
  {
    SetTimeStepRange_11(id0,id1);
  }

  private native void SetTimeStepRange_12(int id0[]);
  public void SetTimeStepRange(int id0[])
  {
    SetTimeStepRange_12(id0);
  }

  private native int GetNumberOfPointArrays_13();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_13();
  }

  private native byte[] GetPointArrayName_14(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_14(id0), StandardCharsets.UTF_8);
  }

  private native void SetCleanGrid_15(int id0);
  public void SetCleanGrid(int id0)
  {
    SetCleanGrid_15(id0);
  }

  private native int GetCleanGrid_16();
  public int GetCleanGrid()
  {
    return GetCleanGrid_16();
  }

  private native void CleanGridOn_17();
  public void CleanGridOn()
  {
    CleanGridOn_17();
  }

  private native void CleanGridOff_18();
  public void CleanGridOff()
  {
    CleanGridOff_18();
  }

  private native void SetSpectralElementIds_19(int id0);
  public void SetSpectralElementIds(int id0)
  {
    SetSpectralElementIds_19(id0);
  }

  private native int GetSpectralElementIds_20();
  public int GetSpectralElementIds()
  {
    return GetSpectralElementIds_20();
  }

  private native void SpectralElementIdsOn_21();
  public void SpectralElementIdsOn()
  {
    SpectralElementIdsOn_21();
  }

  private native void SpectralElementIdsOff_22();
  public void SpectralElementIdsOff()
  {
    SpectralElementIdsOff_22();
  }

  private native boolean GetPointArrayStatus_23(byte[] id0, int len0);
  public boolean GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_23(bytes0, bytes0.length);
  }

  private native boolean GetPointArrayStatus_24(int id0);
  public boolean GetPointArrayStatus(int id0)
  {
    return GetPointArrayStatus_24(id0);
  }

  private native void SetPointArrayStatus_25(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_25(bytes0, bytes0.length,id1);
  }

  private native void DisableAllPointArrays_26();
  public void DisableAllPointArrays()
  {
    DisableAllPointArrays_26();
  }

  private native void EnableAllPointArrays_27();
  public void EnableAllPointArrays()
  {
    EnableAllPointArrays_27();
  }

  private native int CanReadFile_28(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_28(bytes0, bytes0.length);
  }

  public vtkNek5000Reader() { super(); }

  public vtkNek5000Reader(long id) { super(id); }
  public native long   VTKInit();

}
