// java wrapper for vtkPlotBar object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotBar extends vtkPlot
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void SetColor_5(byte id0,byte id1,byte id2,byte id3);
  public void SetColor(byte id0,byte id1,byte id2,byte id3)
  {
    SetColor_5(id0,id1,id2,id3);
  }

  private native void SetColorF_6(double id0,double id1,double id2,double id3);
  public void SetColorF(double id0,double id1,double id2,double id3)
  {
    SetColorF_6(id0,id1,id2,id3);
  }

  private native void SetColorF_7(double id0,double id1,double id2);
  public void SetColorF(double id0,double id1,double id2)
  {
    SetColorF_7(id0,id1,id2);
  }

  private native void SetColor_8(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_8(id0,id1,id2);
  }

  private native void GetColorF_9(double id0[]);
  public void GetColorF(double id0[])
  {
    GetColorF_9(id0);
  }

  private native void GetColor_10(double id0[]);
  public void GetColor(double id0[])
  {
    GetColor_10(id0);
  }

  private native void SetWidth_11(float id0);
  public void SetWidth(float id0)
  {
    SetWidth_11(id0);
  }

  private native float GetWidth_12();
  public float GetWidth()
  {
    return GetWidth_12();
  }

  private native void SetOffset_13(float id0);
  public void SetOffset(float id0)
  {
    SetOffset_13(id0);
  }

  private native float GetOffset_14();
  public float GetOffset()
  {
    return GetOffset_14();
  }

  private native void SetOrientation_15(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_15(id0);
  }

  private native int GetOrientation_16();
  public int GetOrientation()
  {
    return GetOrientation_16();
  }

  private native void GetBounds_17(double id0[],boolean id1);
  public void GetBounds(double id0[],boolean id1)
  {
    GetBounds_17(id0,id1);
  }

  private native void GetBounds_18(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_18(id0);
  }

  private native void GetUnscaledInputBounds_19(double id0[]);
  public void GetUnscaledInputBounds(double id0[])
  {
    GetUnscaledInputBounds_19(id0);
  }

  private native void SetInputArray_20(int id0,byte[] id1, int len1);
  public void SetInputArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetInputArray_20(id0,bytes1, bytes1.length);
  }

  private native void SetColorSeries_21(vtkColorSeries id0);
  public void SetColorSeries(vtkColorSeries id0)
  {
    SetColorSeries_21(id0);
  }

  private native long GetColorSeries_22();
  public vtkColorSeries GetColorSeries()
  {
    long temp = GetColorSeries_22();

    if (temp == 0) return null;
    return (vtkColorSeries)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLookupTable_23(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_23(id0);
  }

  private native long GetLookupTable_24();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_24();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLookupTable_25();
  public void CreateDefaultLookupTable()
  {
    CreateDefaultLookupTable_25();
  }

  private native void SetScalarVisibility_26(boolean id0);
  public void SetScalarVisibility(boolean id0)
  {
    SetScalarVisibility_26(id0);
  }

  private native boolean GetScalarVisibility_27();
  public boolean GetScalarVisibility()
  {
    return GetScalarVisibility_27();
  }

  private native void ScalarVisibilityOn_28();
  public void ScalarVisibilityOn()
  {
    ScalarVisibilityOn_28();
  }

  private native void ScalarVisibilityOff_29();
  public void ScalarVisibilityOff()
  {
    ScalarVisibilityOff_29();
  }

  private native void SetEnableOpacityMapping_30(boolean id0);
  public void SetEnableOpacityMapping(boolean id0)
  {
    SetEnableOpacityMapping_30(id0);
  }

  private native boolean GetEnableOpacityMapping_31();
  public boolean GetEnableOpacityMapping()
  {
    return GetEnableOpacityMapping_31();
  }

  private native void EnableOpacityMappingOn_32();
  public void EnableOpacityMappingOn()
  {
    EnableOpacityMappingOn_32();
  }

  private native void EnableOpacityMappingOff_33();
  public void EnableOpacityMappingOff()
  {
    EnableOpacityMappingOff_33();
  }

  private native void SelectColorArray_34(long id0);
  public void SelectColorArray(long id0)
  {
    SelectColorArray_34(id0);
  }

  private native void SelectColorArray_35(byte[] id0, int len0);
  public void SelectColorArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectColorArray_35(bytes0, bytes0.length);
  }

  private native byte[] GetColorArrayName_36();
  public String GetColorArrayName()
  {
    return new String(GetColorArrayName_36(), StandardCharsets.UTF_8);
  }

  private native long GetLabels_37();
  public vtkStringArray GetLabels()
  {
    long temp = GetLabels_37();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGroupName_38(byte[] id0, int len0);
  public void SetGroupName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGroupName_38(bytes0, bytes0.length);
  }

  private native byte[] GetGroupName_39();
  public String GetGroupName()
  {
    return new String(GetGroupName_39(), StandardCharsets.UTF_8);
  }

  private native int GetBarsCount_40();
  public int GetBarsCount()
  {
    return GetBarsCount_40();
  }

  private native void GetDataBounds_41(double id0[]);
  public void GetDataBounds(double id0[])
  {
    GetDataBounds_41(id0);
  }

  private native boolean UpdateCache_42();
  public boolean UpdateCache()
  {
    return UpdateCache_42();
  }

  public vtkPlotBar() { super(); }

  public vtkPlotBar(long id) { super(id); }
  public native long   VTKInit();

}
