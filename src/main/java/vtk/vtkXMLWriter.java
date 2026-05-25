// java wrapper for vtkXMLWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLWriter extends vtkXMLWriterBase
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

  private native void SetInputData_4(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_4(id0);
  }

  private native void SetInputData_5(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_5(id0,id1);
  }

  private native long GetInput_6(int id0);
  public vtkDataObject GetInput(int id0)
  {
    long temp = GetInput_6(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_7();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_7();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfTimeSteps_8();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_8();
  }

  private native void SetNumberOfTimeSteps_9(int id0);
  public void SetNumberOfTimeSteps(int id0)
  {
    SetNumberOfTimeSteps_9(id0);
  }

  private native void Start_10();
  public void Start()
  {
    Start_10();
  }

  private native void Stop_11();
  public void Stop()
  {
    Stop_11();
  }

  private native void WriteNextTime_12(double id0);
  public void WriteNextTime(double id0)
  {
    WriteNextTime_12(id0);
  }

  public vtkXMLWriter() { super(); }

  public vtkXMLWriter(long id) { super(id); }

}
