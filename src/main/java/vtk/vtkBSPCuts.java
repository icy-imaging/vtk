// java wrapper for vtkBSPCuts object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBSPCuts extends vtkDataObject
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native void CreateCuts_5(vtkKdNode id0);
  public void CreateCuts(vtkKdNode id0)
  {
    CreateCuts_5(id0);
  }

  private native long GetKdNodeTree_6();
  public vtkKdNode GetKdNodeTree()
  {
    long temp = GetKdNodeTree_6();

    if (temp == 0) return null;
    return (vtkKdNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfCuts_7();
  public int GetNumberOfCuts()
  {
    return GetNumberOfCuts_7();
  }

  private native int Equals_8(vtkBSPCuts id0,double id1);
  public int Equals(vtkBSPCuts id0,double id1)
  {
    return Equals_8(id0,id1);
  }

  private native void PrintTree_9();
  public void PrintTree()
  {
    PrintTree_9();
  }

  private native void PrintArrays_10();
  public void PrintArrays()
  {
    PrintArrays_10();
  }

  private native long GetData_11(vtkInformation id0);
  public vtkBSPCuts GetData(vtkInformation id0)
  {
    long temp = GetData_11(id0);

    if (temp == 0) return null;
    return (vtkBSPCuts)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_12(vtkInformationVector id0,int id1);
  public vtkBSPCuts GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_12(id0,id1);

    if (temp == 0) return null;
    return (vtkBSPCuts)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_13();
  public void Initialize()
  {
    Initialize_13();
  }

  private native void ShallowCopy_14(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_14(id0);
  }

  private native void DeepCopy_15(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_15(id0);
  }

  public vtkBSPCuts() { super(); }

  public vtkBSPCuts(long id) { super(id); }
  public native long   VTKInit();

}
