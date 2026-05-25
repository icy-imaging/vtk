// java wrapper for vtkEnSightWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEnSightWriter extends vtkWriter
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

  private native void SetProcessNumber_4(int id0);
  public void SetProcessNumber(int id0)
  {
    SetProcessNumber_4(id0);
  }

  private native int GetProcessNumber_5();
  public int GetProcessNumber()
  {
    return GetProcessNumber_5();
  }

  private native void SetPath_6(byte[] id0, int len0);
  public void SetPath(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPath_6(bytes0, bytes0.length);
  }

  private native byte[] GetPath_7();
  public String GetPath()
  {
    return new String(GetPath_7(), StandardCharsets.UTF_8);
  }

  private native void SetBaseName_8(byte[] id0, int len0);
  public void SetBaseName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBaseName_8(bytes0, bytes0.length);
  }

  private native byte[] GetBaseName_9();
  public String GetBaseName()
  {
    return new String(GetBaseName_9(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_10(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_10(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_11();
  public String GetFileName()
  {
    return new String(GetFileName_11(), StandardCharsets.UTF_8);
  }

  private native void SetTimeStep_12(int id0);
  public void SetTimeStep(int id0)
  {
    SetTimeStep_12(id0);
  }

  private native int GetTimeStep_13();
  public int GetTimeStep()
  {
    return GetTimeStep_13();
  }

  private native void SetGhostLevel_14(int id0);
  public void SetGhostLevel(int id0)
  {
    SetGhostLevel_14(id0);
  }

  private native int GetGhostLevel_15();
  public int GetGhostLevel()
  {
    return GetGhostLevel_15();
  }

  private native void SetTransientGeometry_16(boolean id0);
  public void SetTransientGeometry(boolean id0)
  {
    SetTransientGeometry_16(id0);
  }

  private native boolean GetTransientGeometry_17();
  public boolean GetTransientGeometry()
  {
    return GetTransientGeometry_17();
  }

  private native void SetNumberOfBlocks_18(int id0);
  public void SetNumberOfBlocks(int id0)
  {
    SetNumberOfBlocks_18(id0);
  }

  private native int GetNumberOfBlocks_19();
  public int GetNumberOfBlocks()
  {
    return GetNumberOfBlocks_19();
  }

  private native void WriteNodeIDsOn_20();
  public void WriteNodeIDsOn()
  {
    WriteNodeIDsOn_20();
  }

  private native void WriteNodeIDsOff_21();
  public void WriteNodeIDsOff()
  {
    WriteNodeIDsOff_21();
  }

  private native void SetWriteNodeIDs_22(boolean id0);
  public void SetWriteNodeIDs(boolean id0)
  {
    SetWriteNodeIDs_22(id0);
  }

  private native boolean GetWriteNodeIDs_23();
  public boolean GetWriteNodeIDs()
  {
    return GetWriteNodeIDs_23();
  }

  private native void WriteElementIDsOn_24();
  public void WriteElementIDsOn()
  {
    WriteElementIDsOn_24();
  }

  private native void WriteElementIDsOff_25();
  public void WriteElementIDsOff()
  {
    WriteElementIDsOff_25();
  }

  private native void SetWriteElementIDs_26(boolean id0);
  public void SetWriteElementIDs(boolean id0)
  {
    SetWriteElementIDs_26(id0);
  }

  private native boolean GetWriteElementIDs_27();
  public boolean GetWriteElementIDs()
  {
    return GetWriteElementIDs_27();
  }

  private native void SetInputData_28(vtkUnstructuredGrid id0);
  public void SetInputData(vtkUnstructuredGrid id0)
  {
    SetInputData_28(id0);
  }

  private native long GetInput_29();
  public vtkUnstructuredGrid GetInput()
  {
    long temp = GetInput_29();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void WriteCaseFile_30(int id0);
  public void WriteCaseFile(int id0)
  {
    WriteCaseFile_30(id0);
  }

  private native void WriteSOSCaseFile_31(int id0);
  public void WriteSOSCaseFile(int id0)
  {
    WriteSOSCaseFile_31(id0);
  }

  public vtkEnSightWriter() { super(); }

  public vtkEnSightWriter(long id) { super(id); }
  public native long   VTKInit();

}
