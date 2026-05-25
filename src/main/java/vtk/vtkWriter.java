// java wrapper for vtkWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWriter extends vtkAlgorithm
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

  private native int Write_4();
  public int Write()
  {
    return Write_4();
  }

  private native void EncodeString_5(byte[] id0, int len0,byte[] id1, int len1,boolean id2);
  public void EncodeString(String id0,String id1,boolean id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    EncodeString_5(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native void SetInputData_6(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_6(id0);
  }

  private native void SetInputData_7(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_7(id0,id1);
  }

  private native long GetInput_8();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_8();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_9(int id0);
  public vtkDataObject GetInput(int id0)
  {
    long temp = GetInput_9(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkWriter() { super(); }

  public vtkWriter(long id) { super(id); }

}
