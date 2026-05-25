// java wrapper for vtkDataAssembly object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataAssembly extends vtkObject
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

  private native boolean InitializeFromXML_5(byte[] id0, int len0);
  public boolean InitializeFromXML(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return InitializeFromXML_5(bytes0, bytes0.length);
  }

  private native int GetRootNode_6();
  public int GetRootNode()
  {
    return GetRootNode_6();
  }

  private native void SetRootNodeName_7(byte[] id0, int len0);
  public void SetRootNodeName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRootNodeName_7(bytes0, bytes0.length);
  }

  private native byte[] GetRootNodeName_8();
  public String GetRootNodeName()
  {
    return new String(GetRootNodeName_8(), StandardCharsets.UTF_8);
  }

  private native int AddNode_9(byte[] id0, int len0,int id1);
  public int AddNode(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddNode_9(bytes0, bytes0.length,id1);
  }

  private native int AddSubtree_10(int id0,vtkDataAssembly id1,int id2);
  public int AddSubtree(int id0,vtkDataAssembly id1,int id2)
  {
    return AddSubtree_10(id0,id1,id2);
  }

  private native boolean RemoveNode_11(int id0);
  public boolean RemoveNode(int id0)
  {
    return RemoveNode_11(id0);
  }

  private native void SetNodeName_12(int id0,byte[] id1, int len1);
  public void SetNodeName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetNodeName_12(id0,bytes1, bytes1.length);
  }

  private native byte[] GetNodeName_13(int id0);
  public String GetNodeName(int id0)
  {
    return new String(GetNodeName_13(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetNodePath_14(int id0);
  public String GetNodePath(int id0)
  {
    return new String(GetNodePath_14(id0), StandardCharsets.UTF_8);
  }

  private native int GetFirstNodeByPath_15(byte[] id0, int len0);
  public int GetFirstNodeByPath(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFirstNodeByPath_15(bytes0, bytes0.length);
  }

  private native boolean AddDataSetIndex_16(int id0,int id1);
  public boolean AddDataSetIndex(int id0,int id1)
  {
    return AddDataSetIndex_16(id0,id1);
  }

  private native boolean AddDataSetIndexRange_17(int id0,int id1,int id2);
  public boolean AddDataSetIndexRange(int id0,int id1,int id2)
  {
    return AddDataSetIndexRange_17(id0,id1,id2);
  }

  private native boolean RemoveDataSetIndex_18(int id0,int id1);
  public boolean RemoveDataSetIndex(int id0,int id1)
  {
    return RemoveDataSetIndex_18(id0,id1);
  }

  private native boolean RemoveAllDataSetIndices_19(int id0,boolean id1);
  public boolean RemoveAllDataSetIndices(int id0,boolean id1)
  {
    return RemoveAllDataSetIndices_19(id0,id1);
  }

  private native int FindFirstNodeWithName_20(byte[] id0, int len0,int id1);
  public int FindFirstNodeWithName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FindFirstNodeWithName_20(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfChildren_21(int id0);
  public int GetNumberOfChildren(int id0)
  {
    return GetNumberOfChildren_21(id0);
  }

  private native int GetChild_22(int id0,int id1);
  public int GetChild(int id0,int id1)
  {
    return GetChild_22(id0,id1);
  }

  private native int GetChildIndex_23(int id0,int id1);
  public int GetChildIndex(int id0,int id1)
  {
    return GetChildIndex_23(id0,id1);
  }

  private native int GetParent_24(int id0);
  public int GetParent(int id0)
  {
    return GetParent_24(id0);
  }

  private native boolean HasAttribute_25(int id0,byte[] id1, int len1);
  public boolean HasAttribute(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return HasAttribute_25(id0,bytes1, bytes1.length);
  }

  private native void SetAttribute_26(int id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetAttribute(int id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetAttribute_26(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native void SetAttribute_27(int id0,byte[] id1, int len1,int id2);
  public void SetAttribute(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAttribute_27(id0,bytes1, bytes1.length,id2);
  }

  private native void SetAttribute_28(int id0,byte[] id1, int len1,long id2);
  public void SetAttribute(int id0,String id1,long id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAttribute_28(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] GetAttributeOrDefault_29(int id0,byte[] id1, int len1,byte[] id2, int len2);
  public String GetAttributeOrDefault(int id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return new String(GetAttributeOrDefault_29(id0,bytes1, bytes1.length,bytes2, bytes2.length), StandardCharsets.UTF_8);
  }

  private native int GetAttributeOrDefault_30(int id0,byte[] id1, int len1,int id2);
  public int GetAttributeOrDefault(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetAttributeOrDefault_30(id0,bytes1, bytes1.length,id2);
  }

  private native long GetAttributeOrDefault_31(int id0,byte[] id1, int len1,long id2);
  public long GetAttributeOrDefault(int id0,String id1,long id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetAttributeOrDefault_31(id0,bytes1, bytes1.length,id2);
  }

  private native void Visit_32(vtkDataAssemblyVisitor id0,int id1);
  public void Visit(vtkDataAssemblyVisitor id0,int id1)
  {
    Visit_32(id0,id1);
  }

  private native void Visit_33(int id0,vtkDataAssemblyVisitor id1,int id2);
  public void Visit(int id0,vtkDataAssemblyVisitor id1,int id2)
  {
    Visit_33(id0,id1,id2);
  }

  private native void DeepCopy_34(vtkDataAssembly id0);
  public void DeepCopy(vtkDataAssembly id0)
  {
    DeepCopy_34(id0);
  }

  private native boolean IsNodeNameValid_35(byte[] id0, int len0);
  public boolean IsNodeNameValid(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsNodeNameValid_35(bytes0, bytes0.length);
  }

  private native byte[] MakeValidNodeName_36(byte[] id0, int len0);
  public String MakeValidNodeName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(MakeValidNodeName_36(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native boolean IsNodeNameReserved_37(byte[] id0, int len0);
  public boolean IsNodeNameReserved(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsNodeNameReserved_37(bytes0, bytes0.length);
  }

  public vtkDataAssembly() { super(); }

  public vtkDataAssembly(long id) { super(id); }
  public native long   VTKInit();

}
