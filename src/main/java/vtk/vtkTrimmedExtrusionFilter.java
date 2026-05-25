// java wrapper for vtkTrimmedExtrusionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTrimmedExtrusionFilter extends vtkPolyDataAlgorithm
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

  private native void SetExtrusionDirection_4(double id0,double id1,double id2);
  public void SetExtrusionDirection(double id0,double id1,double id2)
  {
    SetExtrusionDirection_4(id0,id1,id2);
  }

  private native void SetExtrusionDirection_5(double id0[]);
  public void SetExtrusionDirection(double id0[])
  {
    SetExtrusionDirection_5(id0);
  }

  private native double[] GetExtrusionDirection_6();
  public double[] GetExtrusionDirection()
  {
    return GetExtrusionDirection_6();
  }

  private native void SetTrimSurfaceData_7(vtkPolyData id0);
  public void SetTrimSurfaceData(vtkPolyData id0)
  {
    SetTrimSurfaceData_7(id0);
  }

  private native void SetTrimSurfaceConnection_8(vtkAlgorithmOutput id0);
  public void SetTrimSurfaceConnection(vtkAlgorithmOutput id0)
  {
    SetTrimSurfaceConnection_8(id0);
  }

  private native long GetTrimSurface_9();
  public vtkPolyData GetTrimSurface()
  {
    long temp = GetTrimSurface_9();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTrimSurface_10(vtkInformationVector id0);
  public vtkPolyData GetTrimSurface(vtkInformationVector id0)
  {
    long temp = GetTrimSurface_10(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCapping_11(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_11(id0);
  }

  private native int GetCapping_12();
  public int GetCapping()
  {
    return GetCapping_12();
  }

  private native void CappingOn_13();
  public void CappingOn()
  {
    CappingOn_13();
  }

  private native void CappingOff_14();
  public void CappingOff()
  {
    CappingOff_14();
  }

  private native void SetExtrusionStrategy_15(int id0);
  public void SetExtrusionStrategy(int id0)
  {
    SetExtrusionStrategy_15(id0);
  }

  private native int GetExtrusionStrategy_16();
  public int GetExtrusionStrategy()
  {
    return GetExtrusionStrategy_16();
  }

  private native void SetExtrusionStrategyToBoundaryEdges_17();
  public void SetExtrusionStrategyToBoundaryEdges()
  {
    SetExtrusionStrategyToBoundaryEdges_17();
  }

  private native void SetExtrusionStrategyToAllEdges_18();
  public void SetExtrusionStrategyToAllEdges()
  {
    SetExtrusionStrategyToAllEdges_18();
  }

  private native void SetCappingStrategy_19(int id0);
  public void SetCappingStrategy(int id0)
  {
    SetCappingStrategy_19(id0);
  }

  private native int GetCappingStrategy_20();
  public int GetCappingStrategy()
  {
    return GetCappingStrategy_20();
  }

  private native void SetCappingStrategyToIntersection_21();
  public void SetCappingStrategyToIntersection()
  {
    SetCappingStrategyToIntersection_21();
  }

  private native void SetCappingStrategyToMinimumDistance_22();
  public void SetCappingStrategyToMinimumDistance()
  {
    SetCappingStrategyToMinimumDistance_22();
  }

  private native void SetCappingStrategyToMaximumDistance_23();
  public void SetCappingStrategyToMaximumDistance()
  {
    SetCappingStrategyToMaximumDistance_23();
  }

  private native void SetCappingStrategyToAverageDistance_24();
  public void SetCappingStrategyToAverageDistance()
  {
    SetCappingStrategyToAverageDistance_24();
  }

  private native void SetLocator_25(vtkAbstractCellLocator id0);
  public void SetLocator(vtkAbstractCellLocator id0)
  {
    SetLocator_25(id0);
  }

  private native long GetLocator_26();
  public vtkAbstractCellLocator GetLocator()
  {
    long temp = GetLocator_26();

    if (temp == 0) return null;
    return (vtkAbstractCellLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTrimmedExtrusionFilter() { super(); }

  public vtkTrimmedExtrusionFilter(long id) { super(id); }
  public native long   VTKInit();

}
