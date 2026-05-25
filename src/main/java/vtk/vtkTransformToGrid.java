// java wrapper for vtkTransformToGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransformToGrid extends vtkAlgorithm
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

  private native void SetInput_4(vtkAbstractTransform id0);
  public void SetInput(vtkAbstractTransform id0)
  {
    SetInput_4(id0);
  }

  private native long GetInput_5();
  public vtkAbstractTransform GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGridExtent_6(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetGridExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetGridExtent_6(id0,id1,id2,id3,id4,id5);
  }

  private native void SetGridExtent_7(int id0[]);
  public void SetGridExtent(int id0[])
  {
    SetGridExtent_7(id0);
  }

  private native int[] GetGridExtent_8();
  public int[] GetGridExtent()
  {
    return GetGridExtent_8();
  }

  private native void SetGridOrigin_9(double id0,double id1,double id2);
  public void SetGridOrigin(double id0,double id1,double id2)
  {
    SetGridOrigin_9(id0,id1,id2);
  }

  private native void SetGridOrigin_10(double id0[]);
  public void SetGridOrigin(double id0[])
  {
    SetGridOrigin_10(id0);
  }

  private native double[] GetGridOrigin_11();
  public double[] GetGridOrigin()
  {
    return GetGridOrigin_11();
  }

  private native void SetGridSpacing_12(double id0,double id1,double id2);
  public void SetGridSpacing(double id0,double id1,double id2)
  {
    SetGridSpacing_12(id0,id1,id2);
  }

  private native void SetGridSpacing_13(double id0[]);
  public void SetGridSpacing(double id0[])
  {
    SetGridSpacing_13(id0);
  }

  private native double[] GetGridSpacing_14();
  public double[] GetGridSpacing()
  {
    return GetGridSpacing_14();
  }

  private native void SetGridScalarType_15(int id0);
  public void SetGridScalarType(int id0)
  {
    SetGridScalarType_15(id0);
  }

  private native int GetGridScalarType_16();
  public int GetGridScalarType()
  {
    return GetGridScalarType_16();
  }

  private native void SetGridScalarTypeToDouble_17();
  public void SetGridScalarTypeToDouble()
  {
    SetGridScalarTypeToDouble_17();
  }

  private native void SetGridScalarTypeToFloat_18();
  public void SetGridScalarTypeToFloat()
  {
    SetGridScalarTypeToFloat_18();
  }

  private native void SetGridScalarTypeToShort_19();
  public void SetGridScalarTypeToShort()
  {
    SetGridScalarTypeToShort_19();
  }

  private native void SetGridScalarTypeToUnsignedShort_20();
  public void SetGridScalarTypeToUnsignedShort()
  {
    SetGridScalarTypeToUnsignedShort_20();
  }

  private native void SetGridScalarTypeToUnsignedChar_21();
  public void SetGridScalarTypeToUnsignedChar()
  {
    SetGridScalarTypeToUnsignedChar_21();
  }

  private native void SetGridScalarTypeToChar_22();
  public void SetGridScalarTypeToChar()
  {
    SetGridScalarTypeToChar_22();
  }

  private native double GetDisplacementScale_23();
  public double GetDisplacementScale()
  {
    return GetDisplacementScale_23();
  }

  private native double GetDisplacementShift_24();
  public double GetDisplacementShift()
  {
    return GetDisplacementShift_24();
  }

  private native long GetOutput_25();
  public vtkImageData GetOutput()
  {
    long temp = GetOutput_25();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTransformToGrid() { super(); }

  public vtkTransformToGrid(long id) { super(id); }
  public native long   VTKInit();

}
