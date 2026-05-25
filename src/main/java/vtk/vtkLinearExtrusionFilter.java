// java wrapper for vtkLinearExtrusionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLinearExtrusionFilter extends vtkPolyDataAlgorithm
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

  private native void SetExtrusionType_4(int id0);
  public void SetExtrusionType(int id0)
  {
    SetExtrusionType_4(id0);
  }

  private native int GetExtrusionTypeMinValue_5();
  public int GetExtrusionTypeMinValue()
  {
    return GetExtrusionTypeMinValue_5();
  }

  private native int GetExtrusionTypeMaxValue_6();
  public int GetExtrusionTypeMaxValue()
  {
    return GetExtrusionTypeMaxValue_6();
  }

  private native int GetExtrusionType_7();
  public int GetExtrusionType()
  {
    return GetExtrusionType_7();
  }

  private native void SetExtrusionTypeToVectorExtrusion_8();
  public void SetExtrusionTypeToVectorExtrusion()
  {
    SetExtrusionTypeToVectorExtrusion_8();
  }

  private native void SetExtrusionTypeToNormalExtrusion_9();
  public void SetExtrusionTypeToNormalExtrusion()
  {
    SetExtrusionTypeToNormalExtrusion_9();
  }

  private native void SetExtrusionTypeToPointExtrusion_10();
  public void SetExtrusionTypeToPointExtrusion()
  {
    SetExtrusionTypeToPointExtrusion_10();
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

  private native void SetScaleFactor_15(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_15(id0);
  }

  private native double GetScaleFactor_16();
  public double GetScaleFactor()
  {
    return GetScaleFactor_16();
  }

  private native void SetVector_17(double id0,double id1,double id2);
  public void SetVector(double id0,double id1,double id2)
  {
    SetVector_17(id0,id1,id2);
  }

  private native void SetVector_18(double id0[]);
  public void SetVector(double id0[])
  {
    SetVector_18(id0);
  }

  private native double[] GetVector_19();
  public double[] GetVector()
  {
    return GetVector_19();
  }

  private native void SetExtrusionPoint_20(double id0,double id1,double id2);
  public void SetExtrusionPoint(double id0,double id1,double id2)
  {
    SetExtrusionPoint_20(id0,id1,id2);
  }

  private native void SetExtrusionPoint_21(double id0[]);
  public void SetExtrusionPoint(double id0[])
  {
    SetExtrusionPoint_21(id0);
  }

  private native double[] GetExtrusionPoint_22();
  public double[] GetExtrusionPoint()
  {
    return GetExtrusionPoint_22();
  }

  public vtkLinearExtrusionFilter() { super(); }

  public vtkLinearExtrusionFilter(long id) { super(id); }
  public native long   VTKInit();

}
