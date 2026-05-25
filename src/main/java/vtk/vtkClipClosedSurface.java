// java wrapper for vtkClipClosedSurface object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkClipClosedSurface extends vtkPolyDataAlgorithm
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

  private native void SetClippingPlanes_4(vtkPlaneCollection id0);
  public void SetClippingPlanes(vtkPlaneCollection id0)
  {
    SetClippingPlanes_4(id0);
  }

  private native long GetClippingPlanes_5();
  public vtkPlaneCollection GetClippingPlanes()
  {
    long temp = GetClippingPlanes_5();

    if (temp == 0) return null;
    return (vtkPlaneCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_6(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_6(id0);
  }

  private native double GetTolerance_7();
  public double GetTolerance()
  {
    return GetTolerance_7();
  }

  private native void SetPassPointData_8(int id0);
  public void SetPassPointData(int id0)
  {
    SetPassPointData_8(id0);
  }

  private native void PassPointDataOn_9();
  public void PassPointDataOn()
  {
    PassPointDataOn_9();
  }

  private native void PassPointDataOff_10();
  public void PassPointDataOff()
  {
    PassPointDataOff_10();
  }

  private native int GetPassPointData_11();
  public int GetPassPointData()
  {
    return GetPassPointData_11();
  }

  private native void SetGenerateOutline_12(int id0);
  public void SetGenerateOutline(int id0)
  {
    SetGenerateOutline_12(id0);
  }

  private native void GenerateOutlineOn_13();
  public void GenerateOutlineOn()
  {
    GenerateOutlineOn_13();
  }

  private native void GenerateOutlineOff_14();
  public void GenerateOutlineOff()
  {
    GenerateOutlineOff_14();
  }

  private native int GetGenerateOutline_15();
  public int GetGenerateOutline()
  {
    return GetGenerateOutline_15();
  }

  private native void SetGenerateFaces_16(int id0);
  public void SetGenerateFaces(int id0)
  {
    SetGenerateFaces_16(id0);
  }

  private native void GenerateFacesOn_17();
  public void GenerateFacesOn()
  {
    GenerateFacesOn_17();
  }

  private native void GenerateFacesOff_18();
  public void GenerateFacesOff()
  {
    GenerateFacesOff_18();
  }

  private native int GetGenerateFaces_19();
  public int GetGenerateFaces()
  {
    return GetGenerateFaces_19();
  }

  private native void SetScalarMode_20(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_20(id0);
  }

  private native int GetScalarModeMinValue_21();
  public int GetScalarModeMinValue()
  {
    return GetScalarModeMinValue_21();
  }

  private native int GetScalarModeMaxValue_22();
  public int GetScalarModeMaxValue()
  {
    return GetScalarModeMaxValue_22();
  }

  private native void SetScalarModeToNone_23();
  public void SetScalarModeToNone()
  {
    SetScalarModeToNone_23();
  }

  private native void SetScalarModeToColors_24();
  public void SetScalarModeToColors()
  {
    SetScalarModeToColors_24();
  }

  private native void SetScalarModeToLabels_25();
  public void SetScalarModeToLabels()
  {
    SetScalarModeToLabels_25();
  }

  private native int GetScalarMode_26();
  public int GetScalarMode()
  {
    return GetScalarMode_26();
  }

  private native byte[] GetScalarModeAsString_27();
  public String GetScalarModeAsString()
  {
    return new String(GetScalarModeAsString_27(), StandardCharsets.UTF_8);
  }

  private native void SetBaseColor_28(double id0,double id1,double id2);
  public void SetBaseColor(double id0,double id1,double id2)
  {
    SetBaseColor_28(id0,id1,id2);
  }

  private native void SetBaseColor_29(double id0[]);
  public void SetBaseColor(double id0[])
  {
    SetBaseColor_29(id0);
  }

  private native double[] GetBaseColor_30();
  public double[] GetBaseColor()
  {
    return GetBaseColor_30();
  }

  private native void SetClipColor_31(double id0,double id1,double id2);
  public void SetClipColor(double id0,double id1,double id2)
  {
    SetClipColor_31(id0,id1,id2);
  }

  private native void SetClipColor_32(double id0[]);
  public void SetClipColor(double id0[])
  {
    SetClipColor_32(id0);
  }

  private native double[] GetClipColor_33();
  public double[] GetClipColor()
  {
    return GetClipColor_33();
  }

  private native void SetActivePlaneId_34(int id0);
  public void SetActivePlaneId(int id0)
  {
    SetActivePlaneId_34(id0);
  }

  private native int GetActivePlaneId_35();
  public int GetActivePlaneId()
  {
    return GetActivePlaneId_35();
  }

  private native void SetActivePlaneColor_36(double id0,double id1,double id2);
  public void SetActivePlaneColor(double id0,double id1,double id2)
  {
    SetActivePlaneColor_36(id0,id1,id2);
  }

  private native void SetActivePlaneColor_37(double id0[]);
  public void SetActivePlaneColor(double id0[])
  {
    SetActivePlaneColor_37(id0);
  }

  private native double[] GetActivePlaneColor_38();
  public double[] GetActivePlaneColor()
  {
    return GetActivePlaneColor_38();
  }

  private native void SetTriangulationErrorDisplay_39(int id0);
  public void SetTriangulationErrorDisplay(int id0)
  {
    SetTriangulationErrorDisplay_39(id0);
  }

  private native void TriangulationErrorDisplayOn_40();
  public void TriangulationErrorDisplayOn()
  {
    TriangulationErrorDisplayOn_40();
  }

  private native void TriangulationErrorDisplayOff_41();
  public void TriangulationErrorDisplayOff()
  {
    TriangulationErrorDisplayOff_41();
  }

  private native int GetTriangulationErrorDisplay_42();
  public int GetTriangulationErrorDisplay()
  {
    return GetTriangulationErrorDisplay_42();
  }

  private native void SetInsideOut_43(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_43(id0);
  }

  private native int GetInsideOut_44();
  public int GetInsideOut()
  {
    return GetInsideOut_44();
  }

  private native void InsideOutOn_45();
  public void InsideOutOn()
  {
    InsideOutOn_45();
  }

  private native void InsideOutOff_46();
  public void InsideOutOff()
  {
    InsideOutOff_46();
  }

  private native void SetGenerateClipFaceOutput_47(int id0);
  public void SetGenerateClipFaceOutput(int id0)
  {
    SetGenerateClipFaceOutput_47(id0);
  }

  private native int GetGenerateClipFaceOutput_48();
  public int GetGenerateClipFaceOutput()
  {
    return GetGenerateClipFaceOutput_48();
  }

  private native void GenerateClipFaceOutputOn_49();
  public void GenerateClipFaceOutputOn()
  {
    GenerateClipFaceOutputOn_49();
  }

  private native void GenerateClipFaceOutputOff_50();
  public void GenerateClipFaceOutputOff()
  {
    GenerateClipFaceOutputOff_50();
  }

  private native long GetClipFaceOutput_51();
  public vtkPolyData GetClipFaceOutput()
  {
    long temp = GetClipFaceOutput_51();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkClipClosedSurface() { super(); }

  public vtkClipClosedSurface(long id) { super(id); }
  public native long   VTKInit();

}
