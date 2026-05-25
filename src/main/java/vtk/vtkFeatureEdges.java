// java wrapper for vtkFeatureEdges object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFeatureEdges extends vtkPolyDataAlgorithm
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

  private native void ExtractAllEdgeTypesOn_4();
  public void ExtractAllEdgeTypesOn()
  {
    ExtractAllEdgeTypesOn_4();
  }

  private native void ExtractAllEdgeTypesOff_5();
  public void ExtractAllEdgeTypesOff()
  {
    ExtractAllEdgeTypesOff_5();
  }

  private native void SetBoundaryEdges_6(boolean id0);
  public void SetBoundaryEdges(boolean id0)
  {
    SetBoundaryEdges_6(id0);
  }

  private native boolean GetBoundaryEdges_7();
  public boolean GetBoundaryEdges()
  {
    return GetBoundaryEdges_7();
  }

  private native void BoundaryEdgesOn_8();
  public void BoundaryEdgesOn()
  {
    BoundaryEdgesOn_8();
  }

  private native void BoundaryEdgesOff_9();
  public void BoundaryEdgesOff()
  {
    BoundaryEdgesOff_9();
  }

  private native void SetFeatureEdges_10(boolean id0);
  public void SetFeatureEdges(boolean id0)
  {
    SetFeatureEdges_10(id0);
  }

  private native boolean GetFeatureEdges_11();
  public boolean GetFeatureEdges()
  {
    return GetFeatureEdges_11();
  }

  private native void FeatureEdgesOn_12();
  public void FeatureEdgesOn()
  {
    FeatureEdgesOn_12();
  }

  private native void FeatureEdgesOff_13();
  public void FeatureEdgesOff()
  {
    FeatureEdgesOff_13();
  }

  private native void SetFeatureAngle_14(double id0);
  public void SetFeatureAngle(double id0)
  {
    SetFeatureAngle_14(id0);
  }

  private native double GetFeatureAngleMinValue_15();
  public double GetFeatureAngleMinValue()
  {
    return GetFeatureAngleMinValue_15();
  }

  private native double GetFeatureAngleMaxValue_16();
  public double GetFeatureAngleMaxValue()
  {
    return GetFeatureAngleMaxValue_16();
  }

  private native double GetFeatureAngle_17();
  public double GetFeatureAngle()
  {
    return GetFeatureAngle_17();
  }

  private native void SetNonManifoldEdges_18(boolean id0);
  public void SetNonManifoldEdges(boolean id0)
  {
    SetNonManifoldEdges_18(id0);
  }

  private native boolean GetNonManifoldEdges_19();
  public boolean GetNonManifoldEdges()
  {
    return GetNonManifoldEdges_19();
  }

  private native void NonManifoldEdgesOn_20();
  public void NonManifoldEdgesOn()
  {
    NonManifoldEdgesOn_20();
  }

  private native void NonManifoldEdgesOff_21();
  public void NonManifoldEdgesOff()
  {
    NonManifoldEdgesOff_21();
  }

  private native void SetManifoldEdges_22(boolean id0);
  public void SetManifoldEdges(boolean id0)
  {
    SetManifoldEdges_22(id0);
  }

  private native boolean GetManifoldEdges_23();
  public boolean GetManifoldEdges()
  {
    return GetManifoldEdges_23();
  }

  private native void ManifoldEdgesOn_24();
  public void ManifoldEdgesOn()
  {
    ManifoldEdgesOn_24();
  }

  private native void ManifoldEdgesOff_25();
  public void ManifoldEdgesOff()
  {
    ManifoldEdgesOff_25();
  }

  private native void SetPassLines_26(boolean id0);
  public void SetPassLines(boolean id0)
  {
    SetPassLines_26(id0);
  }

  private native boolean GetPassLines_27();
  public boolean GetPassLines()
  {
    return GetPassLines_27();
  }

  private native void PassLinesOn_28();
  public void PassLinesOn()
  {
    PassLinesOn_28();
  }

  private native void PassLinesOff_29();
  public void PassLinesOff()
  {
    PassLinesOff_29();
  }

  private native void SetColoring_30(boolean id0);
  public void SetColoring(boolean id0)
  {
    SetColoring_30(id0);
  }

  private native boolean GetColoring_31();
  public boolean GetColoring()
  {
    return GetColoring_31();
  }

  private native void ColoringOn_32();
  public void ColoringOn()
  {
    ColoringOn_32();
  }

  private native void ColoringOff_33();
  public void ColoringOff()
  {
    ColoringOff_33();
  }

  private native void SetRemoveGhostInterfaces_34(boolean id0);
  public void SetRemoveGhostInterfaces(boolean id0)
  {
    SetRemoveGhostInterfaces_34(id0);
  }

  private native boolean GetRemoveGhostInterfaces_35();
  public boolean GetRemoveGhostInterfaces()
  {
    return GetRemoveGhostInterfaces_35();
  }

  private native void RemoveGhostInterfacesOn_36();
  public void RemoveGhostInterfacesOn()
  {
    RemoveGhostInterfacesOn_36();
  }

  private native void RemoveGhostInterfacesOff_37();
  public void RemoveGhostInterfacesOff()
  {
    RemoveGhostInterfacesOff_37();
  }

  private native void SetLocator_38(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_38(id0);
  }

  private native long GetLocator_39();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_39();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_40();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_40();
  }

  private native long GetMTime_41();
  public long GetMTime()
  {
    return GetMTime_41();
  }

  private native void SetOutputPointsPrecision_42(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_42(id0);
  }

  private native int GetOutputPointsPrecision_43();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_43();
  }

  public vtkFeatureEdges() { super(); }

  public vtkFeatureEdges(long id) { super(id); }
  public native long   VTKInit();

}
