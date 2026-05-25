// java wrapper for vtkEnSightGoldCombinedReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEnSightGoldCombinedReader extends vtkPartitionedDataSetCollectionAlgorithm
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

  private native long GetController_4();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_4();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetController_5(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_5(id0);
  }

  private native void SetCaseFileName_6(byte[] id0, int len0);
  public void SetCaseFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCaseFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetCaseFileName_7();
  public String GetCaseFileName()
  {
    return new String(GetCaseFileName_7(), StandardCharsets.UTF_8);
  }

  private native void SetFilePath_8(byte[] id0, int len0);
  public void SetFilePath(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePath_8(bytes0, bytes0.length);
  }

  private native byte[] GetFilePath_9();
  public String GetFilePath()
  {
    return new String(GetFilePath_9(), StandardCharsets.UTF_8);
  }

  private native long GetAllTimeSteps_10();
  public vtkDoubleArray GetAllTimeSteps()
  {
    long temp = GetAllTimeSteps_10();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTimeValue_11(double id0);
  public void SetTimeValue(double id0)
  {
    SetTimeValue_11(id0);
  }

  private native double GetTimeValue_12();
  public double GetTimeValue()
  {
    return GetTimeValue_12();
  }

  private native void SetPartOfSOSFile_13(boolean id0);
  public void SetPartOfSOSFile(boolean id0)
  {
    SetPartOfSOSFile_13(id0);
  }

  private native boolean GetPartOfSOSFile_14();
  public boolean GetPartOfSOSFile()
  {
    return GetPartOfSOSFile_14();
  }

  private native int CanReadFile_15(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_15(bytes0, bytes0.length);
  }

  private native long GetPartSelection_16();
  public vtkDataArraySelection GetPartSelection()
  {
    long temp = GetPartSelection_16();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointArraySelection_17();
  public vtkDataArraySelection GetPointArraySelection()
  {
    long temp = GetPointArraySelection_17();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellArraySelection_18();
  public vtkDataArraySelection GetCellArraySelection()
  {
    long temp = GetCellArraySelection_18();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFieldArraySelection_19();
  public vtkDataArraySelection GetFieldArraySelection()
  {
    long temp = GetFieldArraySelection_19();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_20();
  public long GetMTime()
  {
    return GetMTime_20();
  }

  public vtkEnSightGoldCombinedReader() { super(); }

  public vtkEnSightGoldCombinedReader(long id) { super(id); }
  public native long   VTKInit();

}
