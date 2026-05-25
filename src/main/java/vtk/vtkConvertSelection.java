// java wrapper for vtkConvertSelection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConvertSelection extends vtkSelectionAlgorithm
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

  private native void SetDataObjectConnection_4(vtkAlgorithmOutput id0);
  public void SetDataObjectConnection(vtkAlgorithmOutput id0)
  {
    SetDataObjectConnection_4(id0);
  }

  private native void SetInputFieldType_5(int id0);
  public void SetInputFieldType(int id0)
  {
    SetInputFieldType_5(id0);
  }

  private native int GetInputFieldType_6();
  public int GetInputFieldType()
  {
    return GetInputFieldType_6();
  }

  private native void SetOutputType_7(int id0);
  public void SetOutputType(int id0)
  {
    SetOutputType_7(id0);
  }

  private native int GetOutputType_8();
  public int GetOutputType()
  {
    return GetOutputType_8();
  }

  private native void SetArrayName_9(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_9(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_10();
  public String GetArrayName()
  {
    return new String(GetArrayName_10(), StandardCharsets.UTF_8);
  }

  private native void SetArrayNames_11(vtkStringArray id0);
  public void SetArrayNames(vtkStringArray id0)
  {
    SetArrayNames_11(id0);
  }

  private native long GetArrayNames_12();
  public vtkStringArray GetArrayNames()
  {
    long temp = GetArrayNames_12();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddArrayName_13(byte[] id0, int len0);
  public void AddArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddArrayName_13(bytes0, bytes0.length);
  }

  private native void ClearArrayNames_14();
  public void ClearArrayNames()
  {
    ClearArrayNames_14();
  }

  private native void SetMatchAnyValues_15(boolean id0);
  public void SetMatchAnyValues(boolean id0)
  {
    SetMatchAnyValues_15(id0);
  }

  private native boolean GetMatchAnyValues_16();
  public boolean GetMatchAnyValues()
  {
    return GetMatchAnyValues_16();
  }

  private native void MatchAnyValuesOn_17();
  public void MatchAnyValuesOn()
  {
    MatchAnyValuesOn_17();
  }

  private native void MatchAnyValuesOff_18();
  public void MatchAnyValuesOff()
  {
    MatchAnyValuesOff_18();
  }

  private native void SetAllowMissingArray_19(boolean id0);
  public void SetAllowMissingArray(boolean id0)
  {
    SetAllowMissingArray_19(id0);
  }

  private native boolean GetAllowMissingArray_20();
  public boolean GetAllowMissingArray()
  {
    return GetAllowMissingArray_20();
  }

  private native void AllowMissingArrayOn_21();
  public void AllowMissingArrayOn()
  {
    AllowMissingArrayOn_21();
  }

  private native void AllowMissingArrayOff_22();
  public void AllowMissingArrayOff()
  {
    AllowMissingArrayOff_22();
  }

  private native void SetSelectionExtractor_23(vtkExtractSelection id0);
  public void SetSelectionExtractor(vtkExtractSelection id0)
  {
    SetSelectionExtractor_23(id0);
  }

  private native long GetSelectionExtractor_24();
  public vtkExtractSelection GetSelectionExtractor()
  {
    long temp = GetSelectionExtractor_24();

    if (temp == 0) return null;
    return (vtkExtractSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ToIndexSelection_25(vtkSelection id0,vtkDataObject id1);
  public vtkSelection ToIndexSelection(vtkSelection id0,vtkDataObject id1)
  {
    long temp = ToIndexSelection_25(id0,id1);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ToGlobalIdSelection_26(vtkSelection id0,vtkDataObject id1);
  public vtkSelection ToGlobalIdSelection(vtkSelection id0,vtkDataObject id1)
  {
    long temp = ToGlobalIdSelection_26(id0,id1);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ToPedigreeIdSelection_27(vtkSelection id0,vtkDataObject id1);
  public vtkSelection ToPedigreeIdSelection(vtkSelection id0,vtkDataObject id1)
  {
    long temp = ToPedigreeIdSelection_27(id0,id1);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ToValueSelection_28(vtkSelection id0,vtkDataObject id1,byte[] id2, int len2);
  public vtkSelection ToValueSelection(vtkSelection id0,vtkDataObject id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    long temp = ToValueSelection_28(id0,id1,bytes2, bytes2.length);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ToValueSelection_29(vtkSelection id0,vtkDataObject id1,vtkStringArray id2);
  public vtkSelection ToValueSelection(vtkSelection id0,vtkDataObject id1,vtkStringArray id2)
  {
    long temp = ToValueSelection_29(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetSelectedItems_30(vtkSelection id0,vtkDataObject id1,int id2,vtkIdTypeArray id3);
  public void GetSelectedItems(vtkSelection id0,vtkDataObject id1,int id2,vtkIdTypeArray id3)
  {
    GetSelectedItems_30(id0,id1,id2,id3);
  }

  private native void GetSelectedVertices_31(vtkSelection id0,vtkGraph id1,vtkIdTypeArray id2);
  public void GetSelectedVertices(vtkSelection id0,vtkGraph id1,vtkIdTypeArray id2)
  {
    GetSelectedVertices_31(id0,id1,id2);
  }

  private native void GetSelectedEdges_32(vtkSelection id0,vtkGraph id1,vtkIdTypeArray id2);
  public void GetSelectedEdges(vtkSelection id0,vtkGraph id1,vtkIdTypeArray id2)
  {
    GetSelectedEdges_32(id0,id1,id2);
  }

  private native void GetSelectedPoints_33(vtkSelection id0,vtkDataSet id1,vtkIdTypeArray id2);
  public void GetSelectedPoints(vtkSelection id0,vtkDataSet id1,vtkIdTypeArray id2)
  {
    GetSelectedPoints_33(id0,id1,id2);
  }

  private native void GetSelectedCells_34(vtkSelection id0,vtkDataSet id1,vtkIdTypeArray id2);
  public void GetSelectedCells(vtkSelection id0,vtkDataSet id1,vtkIdTypeArray id2)
  {
    GetSelectedCells_34(id0,id1,id2);
  }

  private native void GetSelectedRows_35(vtkSelection id0,vtkTable id1,vtkIdTypeArray id2);
  public void GetSelectedRows(vtkSelection id0,vtkTable id1,vtkIdTypeArray id2)
  {
    GetSelectedRows_35(id0,id1,id2);
  }

  private native long ToSelectionType_36(vtkSelection id0,vtkDataObject id1,int id2,vtkStringArray id3,int id4,boolean id5);
  public vtkSelection ToSelectionType(vtkSelection id0,vtkDataObject id1,int id2,vtkStringArray id3,int id4,boolean id5)
  {
    long temp = ToSelectionType_36(id0,id1,id2,id3,id4,id5);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkConvertSelection() { super(); }

  public vtkConvertSelection(long id) { super(id); }
  public native long   VTKInit();

}
