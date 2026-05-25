// java wrapper for vtkEnSightSOSGoldReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEnSightSOSGoldReader extends vtkPartitionedDataSetCollectionAlgorithm
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

  private native byte[] GetCaseFileName_6();
  public String GetCaseFileName()
  {
    return new String(GetCaseFileName_6(), StandardCharsets.UTF_8);
  }

  private native void SetCaseFileName_7(byte[] id0, int len0);
  public void SetCaseFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCaseFileName_7(bytes0, bytes0.length);
  }

  private native int CanReadFile_8(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_8(bytes0, bytes0.length);
  }

  private native long GetPartSelection_9();
  public vtkDataArraySelection GetPartSelection()
  {
    long temp = GetPartSelection_9();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointArraySelection_10();
  public vtkDataArraySelection GetPointArraySelection()
  {
    long temp = GetPointArraySelection_10();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellArraySelection_11();
  public vtkDataArraySelection GetCellArraySelection()
  {
    long temp = GetCellArraySelection_11();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFieldArraySelection_12();
  public vtkDataArraySelection GetFieldArraySelection()
  {
    long temp = GetFieldArraySelection_12();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_13();
  public long GetMTime()
  {
    return GetMTime_13();
  }

  public vtkEnSightSOSGoldReader() { super(); }

  public vtkEnSightSOSGoldReader(long id) { super(id); }
  public native long   VTKInit();

}
