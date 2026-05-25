// java wrapper for vtkStructuredGridAppend object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredGridAppend extends vtkStructuredGridAlgorithm
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

  private native void ReplaceNthInputConnection_4(int id0,vtkAlgorithmOutput id1);
  public void ReplaceNthInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    ReplaceNthInputConnection_4(id0,id1);
  }

  private native void SetInputData_5(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_5(id0,id1);
  }

  private native void SetInputData_6(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_6(id0);
  }

  private native long GetInput_7(int id0);
  public vtkDataObject GetInput(int id0)
  {
    long temp = GetInput_7(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_8();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_8();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfInputs_9();
  public int GetNumberOfInputs()
  {
    return GetNumberOfInputs_9();
  }

  public vtkStructuredGridAppend() { super(); }

  public vtkStructuredGridAppend(long id) { super(id); }
  public native long   VTKInit();

}
