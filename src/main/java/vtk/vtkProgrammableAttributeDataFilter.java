// java wrapper for vtkProgrammableAttributeDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProgrammableAttributeDataFilter extends vtkDataSetAlgorithm
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

  private native void AddInput_4(vtkDataSet id0);
  public void AddInput(vtkDataSet id0)
  {
    AddInput_4(id0);
  }

  private native void RemoveInput_5(vtkDataSet id0);
  public void RemoveInput(vtkDataSet id0)
  {
    RemoveInput_5(id0);
  }

  private native long GetInputList_6();
  public vtkDataSetCollection GetInputList()
  {
    long temp = GetInputList_6();

    if (temp == 0) return null;
    return (vtkDataSetCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExecuteMethod_7( Object id0, byte[] id1, int len1);
  public void SetExecuteMethod( Object id0, String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetExecuteMethod_7(id0, bytes1, bytes1.length);
  }

  public vtkProgrammableAttributeDataFilter() { super(); }

  public vtkProgrammableAttributeDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
