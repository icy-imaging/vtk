// java wrapper for vtkSelection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSelection extends vtkDataObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native int GetNumberOfNodes_6();
  public int GetNumberOfNodes()
  {
    return GetNumberOfNodes_6();
  }

  private native long GetNode_7(int id0);
  public vtkSelectionNode GetNode(int id0)
  {
    long temp = GetNode_7(id0);

    if (temp == 0) return null;
    return (vtkSelectionNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNode_8(byte[] id0, int len0);
  public vtkSelectionNode GetNode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetNode_8(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkSelectionNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] AddNode_9(vtkSelectionNode id0);
  public String AddNode(vtkSelectionNode id0)
  {
    return new String(AddNode_9(id0), StandardCharsets.UTF_8);
  }

  private native void SetNode_10(byte[] id0, int len0,vtkSelectionNode id1);
  public void SetNode(String id0,vtkSelectionNode id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNode_10(bytes0, bytes0.length,id1);
  }

  private native byte[] GetNodeNameAtIndex_11(int id0);
  public String GetNodeNameAtIndex(int id0)
  {
    return new String(GetNodeNameAtIndex_11(id0), StandardCharsets.UTF_8);
  }

  private native void RemoveNode_12(int id0);
  public void RemoveNode(int id0)
  {
    RemoveNode_12(id0);
  }

  private native void RemoveNode_13(byte[] id0, int len0);
  public void RemoveNode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveNode_13(bytes0, bytes0.length);
  }

  private native void RemoveNode_14(vtkSelectionNode id0);
  public void RemoveNode(vtkSelectionNode id0)
  {
    RemoveNode_14(id0);
  }

  private native void RemoveAllNodes_15();
  public void RemoveAllNodes()
  {
    RemoveAllNodes_15();
  }

  private native void SetExpression_16(byte[] id0, int len0);
  public void SetExpression(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetExpression_16(bytes0, bytes0.length);
  }

  private native byte[] GetExpression_17();
  public String GetExpression()
  {
    return new String(GetExpression_17(), StandardCharsets.UTF_8);
  }

  private native void DeepCopy_18(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_18(id0);
  }

  private native void ShallowCopy_19(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_19(id0);
  }

  private native void Union_20(vtkSelection id0);
  public void Union(vtkSelection id0)
  {
    Union_20(id0);
  }

  private native void Union_21(vtkSelectionNode id0);
  public void Union(vtkSelectionNode id0)
  {
    Union_21(id0);
  }

  private native void Subtract_22(vtkSelection id0);
  public void Subtract(vtkSelection id0)
  {
    Subtract_22(id0);
  }

  private native void Subtract_23(vtkSelectionNode id0);
  public void Subtract(vtkSelectionNode id0)
  {
    Subtract_23(id0);
  }

  private native long GetMTime_24();
  public long GetMTime()
  {
    return GetMTime_24();
  }

  private native void Dump_25();
  public void Dump()
  {
    Dump_25();
  }

  private native long GetData_26(vtkInformation id0);
  public vtkSelection GetData(vtkInformation id0)
  {
    long temp = GetData_26(id0);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_27(vtkInformationVector id0,int id1);
  public vtkSelection GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_27(id0,id1);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSelection() { super(); }

  public vtkSelection(long id) { super(id); }
  public native long   VTKInit();

}
