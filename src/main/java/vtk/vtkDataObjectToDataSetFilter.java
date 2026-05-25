// java wrapper for vtkDataObjectToDataSetFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataObjectToDataSetFilter extends vtkDataSetAlgorithm
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

  private native long GetInput_4();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_4();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDataSetType_5(int id0);
  public void SetDataSetType(int id0)
  {
    SetDataSetType_5(id0);
  }

  private native int GetDataSetType_6();
  public int GetDataSetType()
  {
    return GetDataSetType_6();
  }

  private native void SetDataSetTypeToPolyData_7();
  public void SetDataSetTypeToPolyData()
  {
    SetDataSetTypeToPolyData_7();
  }

  private native void SetDataSetTypeToStructuredPoints_8();
  public void SetDataSetTypeToStructuredPoints()
  {
    SetDataSetTypeToStructuredPoints_8();
  }

  private native void SetDataSetTypeToStructuredGrid_9();
  public void SetDataSetTypeToStructuredGrid()
  {
    SetDataSetTypeToStructuredGrid_9();
  }

  private native void SetDataSetTypeToRectilinearGrid_10();
  public void SetDataSetTypeToRectilinearGrid()
  {
    SetDataSetTypeToRectilinearGrid_10();
  }

  private native void SetDataSetTypeToUnstructuredGrid_11();
  public void SetDataSetTypeToUnstructuredGrid()
  {
    SetDataSetTypeToUnstructuredGrid_11();
  }

  private native long GetOutput_12();
  public vtkDataSet GetOutput()
  {
    long temp = GetOutput_12();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_13(int id0);
  public vtkDataSet GetOutput(int id0)
  {
    long temp = GetOutput_13(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolyDataOutput_14();
  public vtkPolyData GetPolyDataOutput()
  {
    long temp = GetPolyDataOutput_14();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredPointsOutput_15();
  public vtkStructuredPoints GetStructuredPointsOutput()
  {
    long temp = GetStructuredPointsOutput_15();

    if (temp == 0) return null;
    return (vtkStructuredPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredGridOutput_16();
  public vtkStructuredGrid GetStructuredGridOutput()
  {
    long temp = GetStructuredGridOutput_16();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridOutput_17();
  public vtkUnstructuredGrid GetUnstructuredGridOutput()
  {
    long temp = GetUnstructuredGridOutput_17();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRectilinearGridOutput_18();
  public vtkRectilinearGrid GetRectilinearGridOutput()
  {
    long temp = GetRectilinearGridOutput_18();

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPointComponent_19(int id0,byte[] id1, int len1,int id2,int id3,int id4,int id5);
  public void SetPointComponent(int id0,String id1,int id2,int id3,int id4,int id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetPointComponent_19(id0,bytes1, bytes1.length,id2,id3,id4,id5);
  }

  private native void SetPointComponent_20(int id0,byte[] id1, int len1,int id2);
  public void SetPointComponent(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetPointComponent_20(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] GetPointComponentArrayName_21(int id0);
  public String GetPointComponentArrayName(int id0)
  {
    return new String(GetPointComponentArrayName_21(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointComponentArrayComponent_22(int id0);
  public int GetPointComponentArrayComponent(int id0)
  {
    return GetPointComponentArrayComponent_22(id0);
  }

  private native int GetPointComponentMinRange_23(int id0);
  public int GetPointComponentMinRange(int id0)
  {
    return GetPointComponentMinRange_23(id0);
  }

  private native int GetPointComponentMaxRange_24(int id0);
  public int GetPointComponentMaxRange(int id0)
  {
    return GetPointComponentMaxRange_24(id0);
  }

  private native int GetPointComponentNormailzeFlag_25(int id0);
  public int GetPointComponentNormailzeFlag(int id0)
  {
    return GetPointComponentNormailzeFlag_25(id0);
  }

  private native void SetVertsComponent_26(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetVertsComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertsComponent_26(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetVertsComponent_27(byte[] id0, int len0,int id1);
  public void SetVertsComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertsComponent_27(bytes0, bytes0.length,id1);
  }

  private native byte[] GetVertsComponentArrayName_28();
  public String GetVertsComponentArrayName()
  {
    return new String(GetVertsComponentArrayName_28(), StandardCharsets.UTF_8);
  }

  private native int GetVertsComponentArrayComponent_29();
  public int GetVertsComponentArrayComponent()
  {
    return GetVertsComponentArrayComponent_29();
  }

  private native int GetVertsComponentMinRange_30();
  public int GetVertsComponentMinRange()
  {
    return GetVertsComponentMinRange_30();
  }

  private native int GetVertsComponentMaxRange_31();
  public int GetVertsComponentMaxRange()
  {
    return GetVertsComponentMaxRange_31();
  }

  private native void SetLinesComponent_32(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetLinesComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLinesComponent_32(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetLinesComponent_33(byte[] id0, int len0,int id1);
  public void SetLinesComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLinesComponent_33(bytes0, bytes0.length,id1);
  }

  private native byte[] GetLinesComponentArrayName_34();
  public String GetLinesComponentArrayName()
  {
    return new String(GetLinesComponentArrayName_34(), StandardCharsets.UTF_8);
  }

  private native int GetLinesComponentArrayComponent_35();
  public int GetLinesComponentArrayComponent()
  {
    return GetLinesComponentArrayComponent_35();
  }

  private native int GetLinesComponentMinRange_36();
  public int GetLinesComponentMinRange()
  {
    return GetLinesComponentMinRange_36();
  }

  private native int GetLinesComponentMaxRange_37();
  public int GetLinesComponentMaxRange()
  {
    return GetLinesComponentMaxRange_37();
  }

  private native void SetPolysComponent_38(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetPolysComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPolysComponent_38(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetPolysComponent_39(byte[] id0, int len0,int id1);
  public void SetPolysComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPolysComponent_39(bytes0, bytes0.length,id1);
  }

  private native byte[] GetPolysComponentArrayName_40();
  public String GetPolysComponentArrayName()
  {
    return new String(GetPolysComponentArrayName_40(), StandardCharsets.UTF_8);
  }

  private native int GetPolysComponentArrayComponent_41();
  public int GetPolysComponentArrayComponent()
  {
    return GetPolysComponentArrayComponent_41();
  }

  private native int GetPolysComponentMinRange_42();
  public int GetPolysComponentMinRange()
  {
    return GetPolysComponentMinRange_42();
  }

  private native int GetPolysComponentMaxRange_43();
  public int GetPolysComponentMaxRange()
  {
    return GetPolysComponentMaxRange_43();
  }

  private native void SetStripsComponent_44(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetStripsComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStripsComponent_44(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetStripsComponent_45(byte[] id0, int len0,int id1);
  public void SetStripsComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStripsComponent_45(bytes0, bytes0.length,id1);
  }

  private native byte[] GetStripsComponentArrayName_46();
  public String GetStripsComponentArrayName()
  {
    return new String(GetStripsComponentArrayName_46(), StandardCharsets.UTF_8);
  }

  private native int GetStripsComponentArrayComponent_47();
  public int GetStripsComponentArrayComponent()
  {
    return GetStripsComponentArrayComponent_47();
  }

  private native int GetStripsComponentMinRange_48();
  public int GetStripsComponentMinRange()
  {
    return GetStripsComponentMinRange_48();
  }

  private native int GetStripsComponentMaxRange_49();
  public int GetStripsComponentMaxRange()
  {
    return GetStripsComponentMaxRange_49();
  }

  private native void SetCellTypeComponent_50(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetCellTypeComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellTypeComponent_50(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetCellTypeComponent_51(byte[] id0, int len0,int id1);
  public void SetCellTypeComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellTypeComponent_51(bytes0, bytes0.length,id1);
  }

  private native byte[] GetCellTypeComponentArrayName_52();
  public String GetCellTypeComponentArrayName()
  {
    return new String(GetCellTypeComponentArrayName_52(), StandardCharsets.UTF_8);
  }

  private native int GetCellTypeComponentArrayComponent_53();
  public int GetCellTypeComponentArrayComponent()
  {
    return GetCellTypeComponentArrayComponent_53();
  }

  private native int GetCellTypeComponentMinRange_54();
  public int GetCellTypeComponentMinRange()
  {
    return GetCellTypeComponentMinRange_54();
  }

  private native int GetCellTypeComponentMaxRange_55();
  public int GetCellTypeComponentMaxRange()
  {
    return GetCellTypeComponentMaxRange_55();
  }

  private native void SetCellConnectivityComponent_56(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetCellConnectivityComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellConnectivityComponent_56(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetCellConnectivityComponent_57(byte[] id0, int len0,int id1);
  public void SetCellConnectivityComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellConnectivityComponent_57(bytes0, bytes0.length,id1);
  }

  private native byte[] GetCellConnectivityComponentArrayName_58();
  public String GetCellConnectivityComponentArrayName()
  {
    return new String(GetCellConnectivityComponentArrayName_58(), StandardCharsets.UTF_8);
  }

  private native int GetCellConnectivityComponentArrayComponent_59();
  public int GetCellConnectivityComponentArrayComponent()
  {
    return GetCellConnectivityComponentArrayComponent_59();
  }

  private native int GetCellConnectivityComponentMinRange_60();
  public int GetCellConnectivityComponentMinRange()
  {
    return GetCellConnectivityComponentMinRange_60();
  }

  private native int GetCellConnectivityComponentMaxRange_61();
  public int GetCellConnectivityComponentMaxRange()
  {
    return GetCellConnectivityComponentMaxRange_61();
  }

  private native void SetDefaultNormalize_62(int id0);
  public void SetDefaultNormalize(int id0)
  {
    SetDefaultNormalize_62(id0);
  }

  private native int GetDefaultNormalize_63();
  public int GetDefaultNormalize()
  {
    return GetDefaultNormalize_63();
  }

  private native void DefaultNormalizeOn_64();
  public void DefaultNormalizeOn()
  {
    DefaultNormalizeOn_64();
  }

  private native void DefaultNormalizeOff_65();
  public void DefaultNormalizeOff()
  {
    DefaultNormalizeOff_65();
  }

  private native void SetDimensions_66(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_66(id0,id1,id2);
  }

  private native void SetDimensions_67(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_67(id0);
  }

  private native int[] GetDimensions_68();
  public int[] GetDimensions()
  {
    return GetDimensions_68();
  }

  private native void SetOrigin_69(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_69(id0,id1,id2);
  }

  private native void SetOrigin_70(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_70(id0);
  }

  private native double[] GetOrigin_71();
  public double[] GetOrigin()
  {
    return GetOrigin_71();
  }

  private native void SetSpacing_72(double id0,double id1,double id2);
  public void SetSpacing(double id0,double id1,double id2)
  {
    SetSpacing_72(id0,id1,id2);
  }

  private native void SetSpacing_73(double id0[]);
  public void SetSpacing(double id0[])
  {
    SetSpacing_73(id0);
  }

  private native double[] GetSpacing_74();
  public double[] GetSpacing()
  {
    return GetSpacing_74();
  }

  private native void SetDimensionsComponent_75(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetDimensionsComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDimensionsComponent_75(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetDimensionsComponent_76(byte[] id0, int len0,int id1);
  public void SetDimensionsComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDimensionsComponent_76(bytes0, bytes0.length,id1);
  }

  private native void SetSpacingComponent_77(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetSpacingComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSpacingComponent_77(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetSpacingComponent_78(byte[] id0, int len0,int id1);
  public void SetSpacingComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSpacingComponent_78(bytes0, bytes0.length,id1);
  }

  private native void SetOriginComponent_79(byte[] id0, int len0,int id1,int id2,int id3);
  public void SetOriginComponent(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginComponent_79(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetOriginComponent_80(byte[] id0, int len0,int id1);
  public void SetOriginComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginComponent_80(bytes0, bytes0.length,id1);
  }

  public vtkDataObjectToDataSetFilter() { super(); }

  public vtkDataObjectToDataSetFilter(long id) { super(id); }
  public native long   VTKInit();

}
