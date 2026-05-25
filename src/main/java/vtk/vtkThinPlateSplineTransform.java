// java wrapper for vtkThinPlateSplineTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkThinPlateSplineTransform extends vtkWarpTransform
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

  private native double GetSigma_4();
  public double GetSigma()
  {
    return GetSigma_4();
  }

  private native void SetSigma_5(double id0);
  public void SetSigma(double id0)
  {
    SetSigma_5(id0);
  }

  private native void SetBasis_6(int id0);
  public void SetBasis(int id0)
  {
    SetBasis_6(id0);
  }

  private native int GetBasis_7();
  public int GetBasis()
  {
    return GetBasis_7();
  }

  private native void SetBasisToR_8();
  public void SetBasisToR()
  {
    SetBasisToR_8();
  }

  private native void SetBasisToR2LogR_9();
  public void SetBasisToR2LogR()
  {
    SetBasisToR2LogR_9();
  }

  private native byte[] GetBasisAsString_10();
  public String GetBasisAsString()
  {
    return new String(GetBasisAsString_10(), StandardCharsets.UTF_8);
  }

  private native void SetSourceLandmarks_11(vtkPoints id0);
  public void SetSourceLandmarks(vtkPoints id0)
  {
    SetSourceLandmarks_11(id0);
  }

  private native long GetSourceLandmarks_12();
  public vtkPoints GetSourceLandmarks()
  {
    long temp = GetSourceLandmarks_12();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTargetLandmarks_13(vtkPoints id0);
  public void SetTargetLandmarks(vtkPoints id0)
  {
    SetTargetLandmarks_13(id0);
  }

  private native long GetTargetLandmarks_14();
  public vtkPoints GetTargetLandmarks()
  {
    long temp = GetTargetLandmarks_14();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_15();
  public long GetMTime()
  {
    return GetMTime_15();
  }

  private native long MakeTransform_16();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_16();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetRegularizeBulkTransform_17();
  public boolean GetRegularizeBulkTransform()
  {
    return GetRegularizeBulkTransform_17();
  }

  private native void SetRegularizeBulkTransform_18(boolean id0);
  public void SetRegularizeBulkTransform(boolean id0)
  {
    SetRegularizeBulkTransform_18(id0);
  }

  private native void RegularizeBulkTransformOn_19();
  public void RegularizeBulkTransformOn()
  {
    RegularizeBulkTransformOn_19();
  }

  private native void RegularizeBulkTransformOff_20();
  public void RegularizeBulkTransformOff()
  {
    RegularizeBulkTransformOff_20();
  }

  public vtkThinPlateSplineTransform() { super(); }

  public vtkThinPlateSplineTransform(long id) { super(id); }
  public native long   VTKInit();

}
