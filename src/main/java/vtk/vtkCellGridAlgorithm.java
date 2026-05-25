// java wrapper for vtkCellGridAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridAlgorithm extends vtkAlgorithm
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

  private native long GetOutput_4();
  public vtkCellGrid GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkCellGrid GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutput_6(vtkDataObject id0);
  public void SetOutput(vtkDataObject id0)
  {
    SetOutput_6(id0);
  }

  private native long GetInput_7();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_7();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_8(int id0);
  public vtkDataObject GetInput(int id0)
  {
    long temp = GetInput_8(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolyDataInput_9(int id0);
  public vtkCellGrid GetPolyDataInput(int id0)
  {
    long temp = GetPolyDataInput_9(id0);

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputData_10(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_10(id0);
  }

  private native void SetInputData_11(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_11(id0,id1);
  }

  private native void AddInputData_12(vtkDataObject id0);
  public void AddInputData(vtkDataObject id0)
  {
    AddInputData_12(id0);
  }

  private native void AddInputData_13(int id0,vtkDataObject id1);
  public void AddInputData(int id0,vtkDataObject id1)
  {
    AddInputData_13(id0,id1);
  }

  private native void SetInputAttributeToProcess_14(int id0,int id1,int id2,byte[] id3, int len3);
  public void SetInputAttributeToProcess(int id0,int id1,int id2,String id3)
  {
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    SetInputAttributeToProcess_14(id0,id1,id2,bytes3, bytes3.length);
  }

  private native long GetInputCellAttributeToProcess_15(int id0,vtkCellGrid id1);
  public vtkCellAttribute GetInputCellAttributeToProcess(int id0,vtkCellGrid id1)
  {
    long temp = GetInputCellAttributeToProcess_15(id0,id1);

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCellGridAlgorithm() { super(); }

  public vtkCellGridAlgorithm(long id) { super(id); }
  public native long   VTKInit();

}
