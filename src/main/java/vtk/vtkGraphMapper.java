// java wrapper for vtkGraphMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphMapper extends vtkMapper
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

  private native void Render_4(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_4(id0,id1);
  }

  private native void SetVertexColorArrayName_5(byte[] id0, int len0);
  public void SetVertexColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexColorArrayName_5(bytes0, bytes0.length);
  }

  private native byte[] GetVertexColorArrayName_6();
  public String GetVertexColorArrayName()
  {
    return new String(GetVertexColorArrayName_6(), StandardCharsets.UTF_8);
  }

  private native void SetColorVertices_7(boolean id0);
  public void SetColorVertices(boolean id0)
  {
    SetColorVertices_7(id0);
  }

  private native boolean GetColorVertices_8();
  public boolean GetColorVertices()
  {
    return GetColorVertices_8();
  }

  private native void ColorVerticesOn_9();
  public void ColorVerticesOn()
  {
    ColorVerticesOn_9();
  }

  private native void ColorVerticesOff_10();
  public void ColorVerticesOff()
  {
    ColorVerticesOff_10();
  }

  private native void SetScaledGlyphs_11(boolean id0);
  public void SetScaledGlyphs(boolean id0)
  {
    SetScaledGlyphs_11(id0);
  }

  private native boolean GetScaledGlyphs_12();
  public boolean GetScaledGlyphs()
  {
    return GetScaledGlyphs_12();
  }

  private native void ScaledGlyphsOn_13();
  public void ScaledGlyphsOn()
  {
    ScaledGlyphsOn_13();
  }

  private native void ScaledGlyphsOff_14();
  public void ScaledGlyphsOff()
  {
    ScaledGlyphsOff_14();
  }

  private native void SetScalingArrayName_15(byte[] id0, int len0);
  public void SetScalingArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalingArrayName_15(bytes0, bytes0.length);
  }

  private native byte[] GetScalingArrayName_16();
  public String GetScalingArrayName()
  {
    return new String(GetScalingArrayName_16(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeVisibility_17(boolean id0);
  public void SetEdgeVisibility(boolean id0)
  {
    SetEdgeVisibility_17(id0);
  }

  private native boolean GetEdgeVisibility_18();
  public boolean GetEdgeVisibility()
  {
    return GetEdgeVisibility_18();
  }

  private native void EdgeVisibilityOn_19();
  public void EdgeVisibilityOn()
  {
    EdgeVisibilityOn_19();
  }

  private native void EdgeVisibilityOff_20();
  public void EdgeVisibilityOff()
  {
    EdgeVisibilityOff_20();
  }

  private native void SetEdgeColorArrayName_21(byte[] id0, int len0);
  public void SetEdgeColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeColorArrayName_21(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeColorArrayName_22();
  public String GetEdgeColorArrayName()
  {
    return new String(GetEdgeColorArrayName_22(), StandardCharsets.UTF_8);
  }

  private native void SetColorEdges_23(boolean id0);
  public void SetColorEdges(boolean id0)
  {
    SetColorEdges_23(id0);
  }

  private native boolean GetColorEdges_24();
  public boolean GetColorEdges()
  {
    return GetColorEdges_24();
  }

  private native void ColorEdgesOn_25();
  public void ColorEdgesOn()
  {
    ColorEdgesOn_25();
  }

  private native void ColorEdgesOff_26();
  public void ColorEdgesOff()
  {
    ColorEdgesOff_26();
  }

  private native void SetEnabledEdgesArrayName_27(byte[] id0, int len0);
  public void SetEnabledEdgesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEnabledEdgesArrayName_27(bytes0, bytes0.length);
  }

  private native byte[] GetEnabledEdgesArrayName_28();
  public String GetEnabledEdgesArrayName()
  {
    return new String(GetEnabledEdgesArrayName_28(), StandardCharsets.UTF_8);
  }

  private native void SetEnableEdgesByArray_29(int id0);
  public void SetEnableEdgesByArray(int id0)
  {
    SetEnableEdgesByArray_29(id0);
  }

  private native int GetEnableEdgesByArray_30();
  public int GetEnableEdgesByArray()
  {
    return GetEnableEdgesByArray_30();
  }

  private native void EnableEdgesByArrayOn_31();
  public void EnableEdgesByArrayOn()
  {
    EnableEdgesByArrayOn_31();
  }

  private native void EnableEdgesByArrayOff_32();
  public void EnableEdgesByArrayOff()
  {
    EnableEdgesByArrayOff_32();
  }

  private native void SetEnabledVerticesArrayName_33(byte[] id0, int len0);
  public void SetEnabledVerticesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEnabledVerticesArrayName_33(bytes0, bytes0.length);
  }

  private native byte[] GetEnabledVerticesArrayName_34();
  public String GetEnabledVerticesArrayName()
  {
    return new String(GetEnabledVerticesArrayName_34(), StandardCharsets.UTF_8);
  }

  private native void SetEnableVerticesByArray_35(int id0);
  public void SetEnableVerticesByArray(int id0)
  {
    SetEnableVerticesByArray_35(id0);
  }

  private native int GetEnableVerticesByArray_36();
  public int GetEnableVerticesByArray()
  {
    return GetEnableVerticesByArray_36();
  }

  private native void EnableVerticesByArrayOn_37();
  public void EnableVerticesByArrayOn()
  {
    EnableVerticesByArrayOn_37();
  }

  private native void EnableVerticesByArrayOff_38();
  public void EnableVerticesByArrayOff()
  {
    EnableVerticesByArrayOff_38();
  }

  private native void SetIconArrayName_39(byte[] id0, int len0);
  public void SetIconArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIconArrayName_39(bytes0, bytes0.length);
  }

  private native byte[] GetIconArrayName_40();
  public String GetIconArrayName()
  {
    return new String(GetIconArrayName_40(), StandardCharsets.UTF_8);
  }

  private native void AddIconType_41(byte[] id0, int len0,int id1);
  public void AddIconType(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddIconType_41(bytes0, bytes0.length,id1);
  }

  private native void ClearIconTypes_42();
  public void ClearIconTypes()
  {
    ClearIconTypes_42();
  }

  private native void SetIconAlignment_43(int id0);
  public void SetIconAlignment(int id0)
  {
    SetIconAlignment_43(id0);
  }

  private native long GetIconTexture_44();
  public vtkTexture GetIconTexture()
  {
    long temp = GetIconTexture_44();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIconTexture_45(vtkTexture id0);
  public void SetIconTexture(vtkTexture id0)
  {
    SetIconTexture_45(id0);
  }

  private native void SetIconVisibility_46(boolean id0);
  public void SetIconVisibility(boolean id0)
  {
    SetIconVisibility_46(id0);
  }

  private native boolean GetIconVisibility_47();
  public boolean GetIconVisibility()
  {
    return GetIconVisibility_47();
  }

  private native void IconVisibilityOn_48();
  public void IconVisibilityOn()
  {
    IconVisibilityOn_48();
  }

  private native void IconVisibilityOff_49();
  public void IconVisibilityOff()
  {
    IconVisibilityOff_49();
  }

  private native float GetVertexPointSize_50();
  public float GetVertexPointSize()
  {
    return GetVertexPointSize_50();
  }

  private native void SetVertexPointSize_51(float id0);
  public void SetVertexPointSize(float id0)
  {
    SetVertexPointSize_51(id0);
  }

  private native float GetEdgeLineWidth_52();
  public float GetEdgeLineWidth()
  {
    return GetEdgeLineWidth_52();
  }

  private native void SetEdgeLineWidth_53(float id0);
  public void SetEdgeLineWidth(float id0)
  {
    SetEdgeLineWidth_53(id0);
  }

  private native void ReleaseGraphicsResources_54(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_54(id0);
  }

  private native long GetMTime_55();
  public long GetMTime()
  {
    return GetMTime_55();
  }

  private native void SetInputData_56(vtkGraph id0);
  public void SetInputData(vtkGraph id0)
  {
    SetInputData_56(id0);
  }

  private native long GetInput_57();
  public vtkGraph GetInput()
  {
    long temp = GetInput_57();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetBounds_58();
  public double[] GetBounds()
  {
    return GetBounds_58();
  }

  private native long GetEdgeLookupTable_59();
  public vtkLookupTable GetEdgeLookupTable()
  {
    long temp = GetEdgeLookupTable_59();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexLookupTable_60();
  public vtkLookupTable GetVertexLookupTable()
  {
    long temp = GetVertexLookupTable_60();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGraphMapper() { super(); }

  public vtkGraphMapper(long id) { super(id); }
  public native long   VTKInit();

}
