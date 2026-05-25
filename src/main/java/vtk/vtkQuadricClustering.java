// java wrapper for vtkQuadricClustering object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuadricClustering extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfXDivisions_4(int id0);
  public void SetNumberOfXDivisions(int id0)
  {
    SetNumberOfXDivisions_4(id0);
  }

  private native void SetNumberOfYDivisions_5(int id0);
  public void SetNumberOfYDivisions(int id0)
  {
    SetNumberOfYDivisions_5(id0);
  }

  private native void SetNumberOfZDivisions_6(int id0);
  public void SetNumberOfZDivisions(int id0)
  {
    SetNumberOfZDivisions_6(id0);
  }

  private native int GetNumberOfXDivisions_7();
  public int GetNumberOfXDivisions()
  {
    return GetNumberOfXDivisions_7();
  }

  private native int GetNumberOfYDivisions_8();
  public int GetNumberOfYDivisions()
  {
    return GetNumberOfYDivisions_8();
  }

  private native int GetNumberOfZDivisions_9();
  public int GetNumberOfZDivisions()
  {
    return GetNumberOfZDivisions_9();
  }

  private native void SetNumberOfDivisions_10(int id0[]);
  public void SetNumberOfDivisions(int id0[])
  {
    SetNumberOfDivisions_10(id0);
  }

  private native void SetNumberOfDivisions_11(int id0,int id1,int id2);
  public void SetNumberOfDivisions(int id0,int id1,int id2)
  {
    SetNumberOfDivisions_11(id0,id1,id2);
  }

  private native int[] GetNumberOfDivisions_12();
  public int[] GetNumberOfDivisions()
  {
    return GetNumberOfDivisions_12();
  }

  private native void GetNumberOfDivisions_13(int id0[]);
  public void GetNumberOfDivisions(int id0[])
  {
    GetNumberOfDivisions_13(id0);
  }

  private native void SetAutoAdjustNumberOfDivisions_14(int id0);
  public void SetAutoAdjustNumberOfDivisions(int id0)
  {
    SetAutoAdjustNumberOfDivisions_14(id0);
  }

  private native int GetAutoAdjustNumberOfDivisions_15();
  public int GetAutoAdjustNumberOfDivisions()
  {
    return GetAutoAdjustNumberOfDivisions_15();
  }

  private native void AutoAdjustNumberOfDivisionsOn_16();
  public void AutoAdjustNumberOfDivisionsOn()
  {
    AutoAdjustNumberOfDivisionsOn_16();
  }

  private native void AutoAdjustNumberOfDivisionsOff_17();
  public void AutoAdjustNumberOfDivisionsOff()
  {
    AutoAdjustNumberOfDivisionsOff_17();
  }

  private native void SetDivisionOrigin_18(double id0,double id1,double id2);
  public void SetDivisionOrigin(double id0,double id1,double id2)
  {
    SetDivisionOrigin_18(id0,id1,id2);
  }

  private native void SetDivisionOrigin_19(double id0[]);
  public void SetDivisionOrigin(double id0[])
  {
    SetDivisionOrigin_19(id0);
  }

  private native double[] GetDivisionOrigin_20();
  public double[] GetDivisionOrigin()
  {
    return GetDivisionOrigin_20();
  }

  private native void SetDivisionSpacing_21(double id0,double id1,double id2);
  public void SetDivisionSpacing(double id0,double id1,double id2)
  {
    SetDivisionSpacing_21(id0,id1,id2);
  }

  private native void SetDivisionSpacing_22(double id0[]);
  public void SetDivisionSpacing(double id0[])
  {
    SetDivisionSpacing_22(id0);
  }

  private native double[] GetDivisionSpacing_23();
  public double[] GetDivisionSpacing()
  {
    return GetDivisionSpacing_23();
  }

  private native void SetUseInputPoints_24(int id0);
  public void SetUseInputPoints(int id0)
  {
    SetUseInputPoints_24(id0);
  }

  private native int GetUseInputPoints_25();
  public int GetUseInputPoints()
  {
    return GetUseInputPoints_25();
  }

  private native void UseInputPointsOn_26();
  public void UseInputPointsOn()
  {
    UseInputPointsOn_26();
  }

  private native void UseInputPointsOff_27();
  public void UseInputPointsOff()
  {
    UseInputPointsOff_27();
  }

  private native void SetUseFeatureEdges_28(int id0);
  public void SetUseFeatureEdges(int id0)
  {
    SetUseFeatureEdges_28(id0);
  }

  private native int GetUseFeatureEdges_29();
  public int GetUseFeatureEdges()
  {
    return GetUseFeatureEdges_29();
  }

  private native void UseFeatureEdgesOn_30();
  public void UseFeatureEdgesOn()
  {
    UseFeatureEdgesOn_30();
  }

  private native void UseFeatureEdgesOff_31();
  public void UseFeatureEdgesOff()
  {
    UseFeatureEdgesOff_31();
  }

  private native long GetFeatureEdges_32();
  public vtkFeatureEdges GetFeatureEdges()
  {
    long temp = GetFeatureEdges_32();

    if (temp == 0) return null;
    return (vtkFeatureEdges)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseFeaturePoints_33(int id0);
  public void SetUseFeaturePoints(int id0)
  {
    SetUseFeaturePoints_33(id0);
  }

  private native int GetUseFeaturePoints_34();
  public int GetUseFeaturePoints()
  {
    return GetUseFeaturePoints_34();
  }

  private native void UseFeaturePointsOn_35();
  public void UseFeaturePointsOn()
  {
    UseFeaturePointsOn_35();
  }

  private native void UseFeaturePointsOff_36();
  public void UseFeaturePointsOff()
  {
    UseFeaturePointsOff_36();
  }

  private native void SetFeaturePointsAngle_37(double id0);
  public void SetFeaturePointsAngle(double id0)
  {
    SetFeaturePointsAngle_37(id0);
  }

  private native double GetFeaturePointsAngleMinValue_38();
  public double GetFeaturePointsAngleMinValue()
  {
    return GetFeaturePointsAngleMinValue_38();
  }

  private native double GetFeaturePointsAngleMaxValue_39();
  public double GetFeaturePointsAngleMaxValue()
  {
    return GetFeaturePointsAngleMaxValue_39();
  }

  private native double GetFeaturePointsAngle_40();
  public double GetFeaturePointsAngle()
  {
    return GetFeaturePointsAngle_40();
  }

  private native void SetUseInternalTriangles_41(int id0);
  public void SetUseInternalTriangles(int id0)
  {
    SetUseInternalTriangles_41(id0);
  }

  private native int GetUseInternalTriangles_42();
  public int GetUseInternalTriangles()
  {
    return GetUseInternalTriangles_42();
  }

  private native void UseInternalTrianglesOn_43();
  public void UseInternalTrianglesOn()
  {
    UseInternalTrianglesOn_43();
  }

  private native void UseInternalTrianglesOff_44();
  public void UseInternalTrianglesOff()
  {
    UseInternalTrianglesOff_44();
  }

  private native void StartAppend_45(double id0,double id1,double id2,double id3,double id4,double id5);
  public void StartAppend(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    StartAppend_45(id0,id1,id2,id3,id4,id5);
  }

  private native void Append_46(vtkPolyData id0);
  public void Append(vtkPolyData id0)
  {
    Append_46(id0);
  }

  private native void EndAppend_47();
  public void EndAppend()
  {
    EndAppend_47();
  }

  private native void SetCopyCellData_48(int id0);
  public void SetCopyCellData(int id0)
  {
    SetCopyCellData_48(id0);
  }

  private native int GetCopyCellData_49();
  public int GetCopyCellData()
  {
    return GetCopyCellData_49();
  }

  private native void CopyCellDataOn_50();
  public void CopyCellDataOn()
  {
    CopyCellDataOn_50();
  }

  private native void CopyCellDataOff_51();
  public void CopyCellDataOff()
  {
    CopyCellDataOff_51();
  }

  private native void SetPreventDuplicateCells_52(int id0);
  public void SetPreventDuplicateCells(int id0)
  {
    SetPreventDuplicateCells_52(id0);
  }

  private native int GetPreventDuplicateCells_53();
  public int GetPreventDuplicateCells()
  {
    return GetPreventDuplicateCells_53();
  }

  private native void PreventDuplicateCellsOn_54();
  public void PreventDuplicateCellsOn()
  {
    PreventDuplicateCellsOn_54();
  }

  private native void PreventDuplicateCellsOff_55();
  public void PreventDuplicateCellsOff()
  {
    PreventDuplicateCellsOff_55();
  }

  public vtkQuadricClustering() { super(); }

  public vtkQuadricClustering(long id) { super(id); }
  public native long   VTKInit();

}
